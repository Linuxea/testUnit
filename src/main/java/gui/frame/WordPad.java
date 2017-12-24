package gui.frame;

import javax.swing.*;

/**
 * site https://www.zhihu.com/question/264532894
 *
 * @author from zhihu and update by me
 * @date 2017/12/24
 */
public class WordPad extends JFrame {
	
	private WordPad() {
		
		setTitle("记事本");
		setBounds(850, 70, 500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		// file menu
		JMenu fileMenu = new JMenu("文件");
		JMenuItem newItem = new JMenuItem("新建");
		JMenuItem openItem = new JMenuItem("打开");
		JMenuItem saveItem = new JMenuItem("保存");
		JMenuItem saveAsItem = new JMenuItem("另存为");
		JMenuItem exitItem = new JMenuItem("退出");
		
		fileMenu.add(newItem);
		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		fileMenu.add(saveAsItem);
		fileMenu.add(exitItem);
		
		// edit menu
		JMenu editMenu = new JMenu("编辑");
		JMenuItem selectAllItem = new JMenuItem("全选");
		JMenuItem foreColor = new JMenuItem("前景色");
		JMenuItem backColor = new JMenuItem("后景色");
		
		editMenu.add(selectAllItem);
		editMenu.add(foreColor);
		editMenu.add(backColor);
		
		// add to menu bar
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		
		// finally set visible true
		setVisible(true);
		
	}
	
}
