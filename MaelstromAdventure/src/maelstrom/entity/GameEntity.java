package maelstrom.entity;

import java.util.ArrayList;
import java.util.UUID;

public class GameEntity {

  private UUID id;
  private ArrayList<BaseComponent> components;
  private boolean deactivated = false;

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

  public void deactivate() {
    deactivated = true;
  }

  public void destroy() {
    for (BaseComponent component : components) {
      component.destroy();
    }
  }
  
  public boolean isDeactivated() {
    return deactivated;
  }
}
