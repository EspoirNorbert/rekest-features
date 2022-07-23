package com.rekest.observableList.impl;

<<<<<<< HEAD
=======

>>>>>>> d688d9767f5640942c65ab40cb4f5d4fcd722d85
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

<<<<<<< HEAD
import com.rekest.entities.Notification;

=======
import com.rekest.entities.Note;
import com.rekest.entities.Notification;
>>>>>>> d688d9767f5640942c65ab40cb4f5d4fcd722d85
import com.rekest.observableList.IObservableList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

<<<<<<< HEAD
public class ObservableListNotification implements IObservableList<Notification> {

=======
public class ObservableListNotification implements IObservableList<Notification> {    
>>>>>>> d688d9767f5640942c65ab40cb4f5d4fcd722d85
	
    private ObservableList<Notification> notificationData = FXCollections.observableArrayList();

	@Override
	public ObservableList<Notification> getData() {
		return notificationData;
	}

	@Override
	public void add(Notification entity) {
		notificationData.add(entity);
	}

	public void delete(Notification entity) {
		notificationData.remove(entity);
	}

	@Override
	public void update(Notification entity) {
		 int index = notificationData.lastIndexOf(entity);
	        if (index >= 0) {
	            //Notification.copy(notificationData.get(index), entity);            
	        }
	}

	@Override
	public void delete(int id) {
		Predicate<Notification> predicate = person -> (person.getId() == id);
        Optional<Notification> person = notificationData.stream().filter(predicate).findFirst();
        if (person != null) {
            notificationData.remove(person.get());
        }
	}

	@Override
	public void setData(List<Notification> entities) {
		this.notificationData.setAll(entities);
	}

	@Override
	public void clear() {
		this.notificationData.clear();
	}

	@Override
	public void addAll(List<Object> entities) {
		 for(Object obj : entities) {
	            if (obj instanceof Notification) {
<<<<<<< HEAD
	                notificationData.add((Notification)obj);
=======
	            	notificationData.add((Notification)obj);
>>>>>>> d688d9767f5640942c65ab40cb4f5d4fcd722d85
	            }
	        }
	}

	@Override
	public void refresh() {}
<<<<<<< HEAD
	
}
=======

}
>>>>>>> d688d9767f5640942c65ab40cb4f5d4fcd722d85
