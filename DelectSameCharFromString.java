public static void main(String[] args) {
		//测试输入的字符串
		String  str = "aabbcccddd15465havbdass";
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			int begin=str.indexOf(c);
			int last=str.lastIndexOf(c);
			//如果该字符的开始和结束索引相同，或者字符刚开始出现
			if (begin==last||begin==i) {
				sb.append(c);
			}
		}
         System.out.println(sb.toString());
	}
