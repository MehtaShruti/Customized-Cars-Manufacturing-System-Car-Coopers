 package business.db4oUtil;



import business.ecosystem.ConfigureASystem;
import business.ecosystem.Ecosystem;
import com.db4o.ObjectContainer;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectSet;
import com.db4o.ta.TransparentPersistenceSupport;





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shrutimehta
 */
public class DB4OUtil {
    private static final String FILENAME="D:\\AED\\Labs\\Lab8_Demo\\Databank.db4o";// path to the data store
    private static DB4OUtil dB4OUtil;
    
    public synchronized static DB4OUtil getInstance(){
        if(dB4OUtil==null)
        {
           dB4OUtil=new DB4OUtil();
        }
        return dB4OUtil;
    }
    
    protected synchronized static void shutdown(ObjectContainer conn){
        if(conn!=null){
            conn.close();
        }
    }
    private ObjectContainer createConnection(){
        try{
            
            EmbeddedConfiguration config=Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            
            config.common().activationDepth(Integer.MAX_VALUE);
            
            config.common().updateDepth(Integer.MAX_VALUE);
            
            config.common().objectClass(Ecosystem.class).cascadeOnUpdate(true);
            
            ObjectContainer db=Db4oEmbedded.openFile(config,FILENAME);
            
            return db;
        }catch(Exception ex)
        {
            System.out.print(ex.getMessage());
        }
        return null;    
        }
    public synchronized void storeSystem(Ecosystem system)
    {
        ObjectContainer conn=createConnection();
        conn.store(system);
        conn.commit();
        conn.close();
    }
        
        public Ecosystem retrieveSystem(){
        
        ObjectContainer conn=createConnection();
        ObjectSet<Ecosystem> systems=conn.query(Ecosystem.class);
        Ecosystem system;

        if(systems.size()==0)
        {
            system=ConfigureASystem.configure();
        }
        else
        {
            system=systems.get(systems.size()-1);
        }
        conn.close();
        return system;
    }
}

