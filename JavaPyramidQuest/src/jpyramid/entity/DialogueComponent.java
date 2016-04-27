package jpyramid.entity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import jpyramid.controller.GameWorld;

// TODO: Verify if current dialogue structure is desired

public class DialogueComponent extends BaseComponent {

  private String description;
  private ArrayList<String> choices;
  
  @SuppressWarnings("unchecked")
  public DialogueComponent(GameEntity owner, GameWorld gameWorld,
      Object[] arguments) throws EntityException {
    super(owner);
    owner.addComponent(this);
    gameWorld.registerComponent(this);
    
    this.description = (String) arguments[0];
    if (arguments[1] instanceof ArrayList) {
      this.choices = (ArrayList<String>) arguments[1];
    } else {
      throw new EntityException("Invalid argument for dialogue choices:"
          + "ArrayList expected");
    }
  }

  
  public int Activate() {
    System.out.println(description);
    
    for (int i=0; i < choices.size(); i++) {
      System.out.println(i+1 + ": " + choices.get(i));
    }
    
    int userInput = -1;
    
    while(true) {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      try {
        userInput = Integer.parseInt(br.readLine());
      } catch (IOException e) {
        e.printStackTrace();
      }
      if (userInput >= 0 && userInput <= choices.size()) {
        return userInput;
      }
    }
  }
}
