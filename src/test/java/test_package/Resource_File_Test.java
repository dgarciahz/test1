package test_package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

import org.testng.annotations.Test;

import test.HelloWorld;

public class Resource_File_Test {
  @Test
  public void f1() throws Exception { 
	  System.err.println("INIC");
	  
	  Properties p=new Properties();
	  
//	  InputStream input = new FileInputStream("testfile.properties");
	  InputStream input =null;
	  input=Resource_File_Test1.class.getClassLoader().getResourceAsStream("testfile.properties");
      p.load(input);
      
      assert(p.getProperty("prop1").equals("1"));
      assert(p.getProperty("prop2").equals("2"));
      assert(p.getProperty("prop3")==null);

      input=Resource_File_Test1.class.getClassLoader().getResourceAsStream("props_dir/testfile2.properties");
      p.load(input);
      assert(p.getProperty("prop1").equals("1"));
      assert(p.getProperty("prop2").equals("modified"));
      assert(p.getProperty("prop3").equals("1234"));
      
	  System.err.println("OVER");
  }
  
  @Test
  public void f2() {
	  HelloWorld h=new HelloWorld();
	  assert(h.getName("name").equals("name"));
	  assert(h.getName("").equals("David"));
  }
}
