- First of all, when we’ll run the code, we can see a Graphical User Interface. In this interface we can see some space to write Name, age, blood group and an entry option. So, when a patient will come, he/she has to entry his/her name, age and blood group in the respective boxes. Then he has to press the entry button to register his name as a patient. If he did any mistake at the time of entry name, age, blood group then he can press the erase button and clear all boxer and write the correct one newly. Then we can see some options:  
	•	Serve patient
	•	Cancel All
	•	Can doctor go home 
	•	Show all patient 

- Then we can see some buttons and a display box. The display box will be in the doctor’s room and also a same display box will be in the patient waiting room. Option numbers are matching the button numbers.



- Button 1:  If a doctor press “1” then the doctor can see in the display that which patient has to go next in the doctor’s room.  Patients also can see the name of next going person in the display. 




- Button 2: This button is mainly for the doctor. If the doctor has any important work or any emergency then he/she can press “Cancel All” which is button “2”. By pressing this button all serial will be canceled and doctor can leave the chamber. 




- Button 3: This button is also for the doctor. If the doctor press “3” then display will show that can he leave or not. If there is no patient then in the display doctor can see “Yes, doctor can go home. No patient is waiting.” But if there is any patient is waiting then doctor can see in the display that “No, doctor cannot go home. Patient is waiting”




- Button 4: This button is for doctor and as well as patient. If doctor or patient want to see all patient name in the list then the doctor has to press “4” and then the display will show all patient name serially. 


Inner Function : 


* I have use queue data structure to maintain all the inner process. Because queue follow “first in first out” system and I need this. Because which patient will come first obviously, he/she will go to the doctor’s room first. When a patient entry his name, age, blood group then the system enqueue the information of the patient in the list. and when doctor press the “serve patient” button then the system dequeue the first patient name from the saved list and decrease the size of queue by 1. 



“waiting_room_management” class is providing the main method of this system.


“Queue.java” class is an interface which is providing the methods.


“patient.java” is the class by which the system can save and access the information of a patient.


“ListQueue.java” is the class in which the system work with the methods from Queue.java interface. 



“management.java” is the class by which the system is taking information from the patient and showing the displays after button press.


![Waiting room management 9_17_2022 3_27_10 AM](https://user-images.githubusercontent.com/58343930/190779938-fd177e15-de25-4a17-aab7-40c718333b8a.png)



