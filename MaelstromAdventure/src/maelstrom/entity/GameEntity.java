package maelstrom.entity;

import java.util.ArrayList;
import java.util.UUID;

public class GameEntity {

  private UUID id;
  private ArrayList<BaseComponent> components;
  
  // Most objects have names and can be referenced by them.
  // Note that this is not a valid identifier for the entity type
  private String name = "";
  
  public GameEntity() {
    id = UUID.randomUUID();
    components = new ArrayList<BaseComponent>();
  }
  
  public UUID getID() {
    return id;
  }
  
  public void addComponent(BaseComponent component) {
    components.add(component);
  }

  public void setName(String name) {
    this.name = name;
  }
  
  public String getName() {
    if (name.equals("")) {
      return "Unset";
    }
    return name;
  }
  
  /**
   * Calls describe method on all components.
   * Will return false if no descriptions have been made.
   */
  public boolean describeComponents() {
    boolean isDescribable = false;
    for (BaseComponent component : components) {
      if (component.getDescription()) {
        isDescribable = true;
      }
    }
    return isDescribable;
  }
}
