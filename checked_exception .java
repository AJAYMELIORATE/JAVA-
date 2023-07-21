import java.io.*;
class sample 
{
	public static vois main(String args [])throws IOexcepion
	{
		Filereader file=new filereader("file_address");
		Bufferreader fileinput=new Bufferreader(file);
		System.out.println(fileInput.readLine());
		file.close();
	}
}