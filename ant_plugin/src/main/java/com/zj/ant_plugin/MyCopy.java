package com.zj.ant_plugin;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.DirectoryScanner;
import org.apache.tools.ant.Task;
import org.apache.tools.ant.types.FileSet;
import org.apache.tools.ant.types.ResourceCollection;

import java.util.Vector;


public class MyCopy  extends Task {
    protected Vector<ResourceCollection> filesets=new Vector<ResourceCollection>();
    FileSet files;
    Rectangle rectangle;
    public void addFiles(FileSet files) {
        this.files = files;
    }

    public void addRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public void addFileset(FileSet fileSet){
        this.filesets.add(fileSet);
    }
    @Override
    public void init() throws BuildException {
        super.init();
    }

    @Override
    public void execute() throws BuildException {
        super.execute();
        DirectoryScanner ds = files.getDirectoryScanner(getProject());
        final String[] srcFiles = ds.getIncludedFiles();
        for(String file:srcFiles){
            log(file);
        }
    }
}
