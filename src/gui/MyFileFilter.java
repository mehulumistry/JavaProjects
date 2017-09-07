package gui;

import javax.swing.filechooser.FileFilter;
import java.io.File;

/**
 * Created by apple on 27/06/17.
 */
public class MyFileFilter extends FileFilter {
    public MyFileFilter(String s, String s1) {


    }

    @Override
    public boolean accept(File f) {
        return false;
    }

    @Override
    public String getDescription() {
        return null;
    }
}
