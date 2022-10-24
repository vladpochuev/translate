
import java.util.Objects;

public class Test {

    private final String translation;

    public Test(String translation) {
        this.translation = translation;
    }


    public Animal getObject(String a){
        for(Animal obj: Animal.values()){

            String spl = obj.getTranslation();

            String[] arr = spl.split(", ");

            for (String s : arr) {
                if (s.equals(a)) {
                    return obj;
                }
            }
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return Objects.equals(translation, test.translation);
    }
}

