package practice;

import org.apache.commons.logging.*;

public class Main_8 {
	public static void main(String[] args) {
		// ���X�g8-5
		Log logger = LogFactory.getLog(Main.class);
		if(args.length != 2) {
			logger.error("�N�������̐����ُ�F" + args.length);
		}
	}
}
