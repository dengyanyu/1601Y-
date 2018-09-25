package 基础数据类型;

public class 加密 {
	public static void main(String[] args) {
		String mw=SHA256Util.getSHA256StrJava("6b86b273ff34fce19d6b804ef"
				+ "f5a3f5747ada4eaa22f1d49c01e52ddb7875b4b6b86b273ff34fce1"
				+ "9d6b804eff5a3f5747ada4eaa22f1d49c01e52ddb7875b4b6b86b273ff34fce19d6b804eff5a3f5747ada4eaa22f1d49c01e52ddb7875b4b6b86b273ff34fce19d6b804eff5a3f5747ada4eaa22f1d49c01e52ddb7875b4b6b86b273ff34fce19d6b804eff5a3f5747ada4eaa22f1d49c01e52ddb7875b4b6b86b273ff34fce19d6b804eff5a3f5747ada4eaa22f1d49c01e52ddb7875b4b"
				+ "6b86b273ff34fce19d6b804eff5a3f5747ada4eaa22f1d49c01e52ddb7875b4b");
		System.out.println(mw);
	}
}
