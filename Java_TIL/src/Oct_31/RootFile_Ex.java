package Oct_31;

import java.io.File;
import java.io.FilenameFilter;

public class RootFile_Ex {

	public static void main(String[] args) {
		File[] roots = File.listRoots();
		
		for (File file : roots) {
			System.out.println(file);
		}
		
		File dir = new File("C:\\Users\\wnsdu\\Documents\\GitHub\\Java_TIL\\Java_TIL\\src");
		//File 생성자에 디렉토리 경로를 넣으면 디렉터리를 가리킴
		
		File target = new File(dir + File.separator + "Oct_31");
		//File 클래스에 separator 속성이 있음
		
		File[] filelist = target.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".java");
			}
		});
		//target 객체 안이 가리키는 디렉토리의 파일 리스트 중 .java 확장자를 가진 파일만 골라냄
		
		for (File file : filelist) {
			System.out.println(file.getName() + ": " + file.canExecute());
		}
	}

}
