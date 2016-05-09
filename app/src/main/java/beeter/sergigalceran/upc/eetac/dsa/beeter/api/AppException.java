package beeter.sergigalceran.upc.eetac.dsa.beeter.api;

/**
 * Created by Sergi1 on 09/04/2015.
 */
public class AppException extends Exception {
    public AppException() {
        super();
    }

    public AppException(String detailMessage) {
        super(detailMessage);
    }
}