import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReaderCallbackImp implements ReaderCallback{
    @Override
    public BufferedReader read(){
        return new BufferedReader(new InputStreamReader(System.in));
    }
}
