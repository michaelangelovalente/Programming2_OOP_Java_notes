
import java.util.Map;
import java.util.HashMap;


public class TextServer implements FileServer{

    private Map<String, String> data;

    public TextServer(){
        this.data = new HashMap<>();
    }

    @Override
    public String load(String filename) throws Exception{ // Even though it implements an interface method that throws an exception, it does not have to throw an error.
        return this.data.get(filename);
    }

    @Override
    public void save(String fileName, String textToSave) throws Exception{
        this.data.put(fileName, textToSave);
    }


}