package Listener;

import java.io.File;

public interface EventListener { //Observador
	void update(String eventType, File file);

}
