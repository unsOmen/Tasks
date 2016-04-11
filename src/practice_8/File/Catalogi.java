package practice_8.File;
// {args: "D.*\.mp3"}
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by OmeN on 11.04.2016.
 */
public class Catalogi {

    private static void fileData(File f) {
        System.out.println("Полное имя: " + f.getAbsolutePath()
        + "\n доступно для чтения: " + f.canRead()
        + "\n доступно для записи: " + f.canWrite()
        + "\n имя файла getName(): " + f.getName()
        + "\n родительский катало: " + f.getParent()
        + "\n путь: " + f.getPath()
        + "\n размер: " + f.length());
    }

    public static void main(String[] args) {
        File path = new File("D:");
        String[] list;
        if(args.length == 0)
            list = path.list();
        else
            list = path.list(new DirFilter(args[0]));
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for(String dirItem : list)
            System.out.println(dirItem);

        fileData(new File(args[0]));
    }
}

class DirFilter implements FilenameFilter {
    private Pattern pattern;

    public DirFilter(String regex) {
        pattern = Pattern.compile(regex);
    }

    public boolean accept(File dir, String name) {
        return pattern.matcher(name).matches();
    }
}
