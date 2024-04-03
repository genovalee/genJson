package tw.fpg.com;

public class GenJson {
    public GenJson() {
        super();
    }

    public static void main(String[] args) {
        JsonObjectTest toJson = new JsonObjectTest();
        System.out.println(toJson.toJson());
    }
}
