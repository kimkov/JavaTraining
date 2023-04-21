package trainingTasks;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

public class ANIODemo {
	public static void main(String[] args) {
		int count;
		Path filePath = null;
//Сначала получить путь к файлу.
		try {
			filePath = Path.of("ANIODemo.txt");
		} catch(InvalidPathException e) {
			System.out.println("Path error " + e);
			return;
		}
//Затем получить канал к этому файлу внутри блока try с ресурсами.
		
		try(SeekableByteChannel fChan = Files.newByteChannel(filePath)) {
			// Выделить па мять под буфер.
			ByteBuffer mBuf = ByteBuffer.allocate(128);
			
			do {
				// Читать данные в буфер.
				count = fChan.read(mBuf);
				// Остановиться , когда достигнут конец файла.
				if(count != -1) {
				// Переустановить буфер в начало , чтобы из него можно было читать .
					mBuf.rewind();
					// Прочитать байты из буфера и отобразить их на экране как символы.
					for(int i = 0; i < count; i++) {
						System.out.println((char) mBuf.get());
					}
				}
			} while(count != -1);
			System.out.println();
		} catch (IOException e) {
			System.out.println("Input-Output Error");
		}
	}
}
