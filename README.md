This work consists of making up a clock within a graphical interface  using a thread.
We will need three Java classes for it :
GraphicalClock :  this class will take care of the visual prowess of the clock,
Time : this class will encapsulate the time related data (seconds, minutes, hours). These informations will be queried from this class, contractly these information will be overwritten every time the clock gets incremeted.
Timeincrementor: this is the thread that will take care of the key functioning of the clock which the incremental aspect of the clock. This thread will run indefinitely, will increment the seconds, minutes, hours, accordingly, from second to second. This thread will get slept for a time laps (1000ms) before it increments the time related data and displays through the graphical interface.
