package Events;
public abstract class EventImpl implements EventInterface{

    private String name;
    private String description;

    public EventImpl(String name) {
        this.name = name;
    }

    @Override
    public String getType() {
        return getType();
    }

    @Override
    public String getDescription() {
        return description;
    }
}
