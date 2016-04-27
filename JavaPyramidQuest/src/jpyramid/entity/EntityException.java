package jpyramid.entity;

public class EntityException extends Exception {

  private static final long serialVersionUID = -5284408380566467615L;

  public EntityException() {
    
  }

  public EntityException(String message) {
    super (message);
  }

  public EntityException(Throwable cause) {
    super (cause);
  }

  public EntityException(String message, Throwable cause) {
    super (message, cause);
  }
}