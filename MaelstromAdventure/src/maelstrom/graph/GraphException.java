package maelstrom.graph;

public class GraphException extends RuntimeException {

  private static final long serialVersionUID = -2881057210763409562L;

  public GraphException () {

  }

  public GraphException (String message) {
    super (message);
  }

  public GraphException (Throwable cause) {
    super (cause);
  }

  public GraphException (String message, Throwable cause) {
    super (message, cause);
  }
}
