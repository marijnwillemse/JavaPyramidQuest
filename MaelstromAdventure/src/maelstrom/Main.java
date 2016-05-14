package maelstrom;

import maelstrom.controller.GameSystem;

public class Main {

  public static void main(String args[]) {
    
    String language = "en_US";

    // Create new game instance and run it
    GameSystem gameSystem = new GameSystem(language);
    gameSystem.run();
  }
}
