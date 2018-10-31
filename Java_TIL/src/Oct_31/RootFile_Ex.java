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
		//File �����ڿ� ���丮 ��θ� ������ ���͸��� ����Ŵ
		
		File target = new File(dir + File.separator + "Oct_31");
		//File Ŭ������ separator �Ӽ��� ����
		
		File[] filelist = target.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".java");
			}
		});
		//target ��ü ���� ����Ű�� ���丮�� ���� ����Ʈ �� .java Ȯ���ڸ� ���� ���ϸ� ���
		
		for (File file : filelist) {
			System.out.println(file.getName() + ": " + file.canExecute());
		}
	}

}
