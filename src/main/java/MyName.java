import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MyName {
    public static void main(String[] args) {
        MyName smn = new MyName();
        System.out.println(smn.serialiseMyName());
    }
    public String serialiseMyName() {
        Iam iam = new Iam("Valerii", "Korezin");
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        return gson.toJson(iam);
    }
}
