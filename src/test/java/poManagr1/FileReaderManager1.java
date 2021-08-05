package poManagr1;

public class FileReaderManager1 {
private FileReaderManager1() {
}
	public static FileReaderManager1 getInstanceFR() {
		FileReaderManager1 helper1= new FileReaderManager1();
		return helper1;
	}

	public ConfigurationReader1 getInstanceCR() throws Throwable {
		ConfigurationReader1 reader1 = new ConfigurationReader1();
		return reader1;
	}

}
