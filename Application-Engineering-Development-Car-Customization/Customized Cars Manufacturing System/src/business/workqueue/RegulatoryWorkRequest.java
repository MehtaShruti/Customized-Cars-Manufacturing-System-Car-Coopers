/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workqueue;

/**
 *
 * @author shrutimehta
 */
public class RegulatoryWorkRequest extends WorkRequest {

    public RegulatoryWorkRequest() {
        super(WorkRequest.WorkRequestType.Regulatory.getValue());
    }
    private String reportType;

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String toString() {
        return this.reportType;
    }

}
