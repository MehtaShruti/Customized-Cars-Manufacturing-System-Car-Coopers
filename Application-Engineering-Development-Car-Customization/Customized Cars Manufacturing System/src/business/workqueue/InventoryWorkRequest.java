/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workqueue;

import business.useraccount.UserAccount;

/**
 *
 * @author shrutimehta
 */
public class InventoryWorkRequest extends WorkRequest {

    public InventoryWorkRequest() {
        super(WorkRequest.WorkRequestType.Inventory.getValue());
    }

    private int itemCount;
    private String itemName;
    private UserAccount manufacturerSenderInv;
    private UserAccount inventoryReceiverInv;
    private UserAccount manufacturerReceiverInv;
    private UserAccount inventorySenderInv;

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public UserAccount getManufacturerSenderInv() {
        return manufacturerSenderInv;
    }

    public void setManufacturerSenderInv(UserAccount manufacturerSenderInv) {
        this.manufacturerSenderInv = manufacturerSenderInv;
    }

    public UserAccount getInventoryReceiverInv() {
        return inventoryReceiverInv;
    }

    public void setInventoryReceiverInv(UserAccount inventoryReceiverInv) {
        this.inventoryReceiverInv = inventoryReceiverInv;
    }

    public UserAccount getManufacturerReceiverInv() {
        return manufacturerReceiverInv;
    }

    public void setManufacturerReceiverInv(UserAccount manufacturerReceiverInv) {
        this.manufacturerReceiverInv = manufacturerReceiverInv;
    }

    public UserAccount getInventorySenderInv() {
        return inventorySenderInv;
    }

    public void setInventorySenderInv(UserAccount inventorySenderInv) {
        this.inventorySenderInv = inventorySenderInv;
    }

    @Override
    public String toString() {
        return itemName;
    }

}
