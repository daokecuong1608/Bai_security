package sv.cuong.Bai_13_Spring_Data_JPA.handle;

public class ErrorResponse {
   private  int status;
    private  String mesage;

    private  long timestamp;

    public ErrorResponse(int status, String mesage) {
        this.status = status;
        this.mesage = mesage;
        this.timestamp = System.currentTimeMillis();
    }

    public int getStatus() {
        return status;
    }

    public String getMesage() {
        return mesage;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setMesage(String mesage) {
        this.mesage = mesage;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
