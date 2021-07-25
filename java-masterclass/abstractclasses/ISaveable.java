import java.util.ArrayList;
import java.util.List;

public interface ISaveable {

    List write();
    void read(List savedValues);

}
