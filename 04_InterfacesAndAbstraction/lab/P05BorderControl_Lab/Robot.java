package P05BorderControl_Lab;

public class Robot implements Identifiable{

    private String id;
    private String model;

    protected Robot(String model, String id) {
        this.setModel(model);
        this.setId(id);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }


}
