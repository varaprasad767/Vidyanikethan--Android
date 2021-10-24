Android Course Content:
-----------------------
1.Def of Android.

>Android is a mobile Operating System Based on Linux Kernel.

>Kernel is an one of the operating system.

>at present days 2lacks application in playstore.

>Android introduced in the year of 2007.

>authers are 1>Andy Rubin

>the first android opeating system introduced in Digital Cameras.

>the first android application developed in Htc Mobile.


Android Versions:
-----------------

A-Alpha

B-Beta

C-Cupcake

D-Donut

E-Eclairs

F-Froyo

G-GingerBread.

H-HoneyComb

I-IceCream Sndwidch

J-JellyBean

K-KitKat

L-Lollipop

M-Marshmallow.

N-Nought

O-oreo

P-Pie(Android-9)

Q-Android 10

R

2.History of Android.

3.Android Project Structure.

System Apps And UserApps:

Contacts        Whatsup

camera          Phonepy

Playstore

SystemApps-PreDefined Apps

UserApps-download the applications via playstore

Api:(Application Programming Interface):

>it can basically design UserInterface Provided By Application

Native C/C++ Library's:

to design the gaming type of application in our Android.

HAL(HardWare Abstarction Layer)

>with the help of hal to connect the mobile device in our Android Studio Pane.

Linux Kernel:

>with the help of linux kernel to provide for security In Android Application.


Challenges of Android Application:
----------------------------------

>Android Supports Multiple Screen Sizes And Resolution.

>Android Supports User Attractable Inteface with the help of Material Design

Library Guide Lines.

>Android Supports for testcases for Phone/Tablets/AndroidTv/Digital Watches....

>Android Supports IOT.(Internet of things).

>With the help of Internet of things to conncet pheripherals any Device.

with the help of Bluetooth Module or Wi-Fi Module.

>Android supports Security with the help of Authentications Using FireBase.


FireBase App Authentication Types:
----------------------------------

1.Using Email ,phone Number.

2.Mobile OTP Authentication.

3.Facebook Authentication.

4.FingerPrint Authentication.

5.Face Recogization.

6.Google SignIn Authentication.

4.Android App Componnets.
------------------------
there are four Components of Android Application.


1.Activity's

2.Services

3.BroadCast Recivers.

4.Content Providers.


Android App Creation Components:
--------------------------------

1.Xml  frontend design purpose

2.backend for handling the Onclick Listeners with the help of java language

or kotlin.

xml structure:
--------------

1.</>---self closing

2.<>
    --external closing
</>


1.Activitys:
-----------

An Activity is an single screen of Ui Design.

An Activity is A Combination of java file+xml file.

Every Application Having Different Screens.

Each And Every Screen Have An Activity.

>the fornt end Application to connect with Android Application

with the help of R.Java file


Example:
-------
R-Resources

layout means-XML File

xml file -called as android-Layout file.

java file -Called as Activity file

To connect with R.java file
---------------------------

(R.layout.layoutname)


Views In Android Application:
-----------------------------

>Views is Basic Building Bolck of Android Application.

>View Are Strating with UpeerCase Letters.

>Views Visible.


Example for Views:
------------------
1.title of the application-(APSRTC)-Android Called As-Textview

2.EditText(Enter Your Email id,Enter Your Mobile No).

user input values to store the edittextview.

3.RadioButton

select the one option in our views

Example:Male,Female

4.Check Box:

with the help of check box view to select the multple options.

Example:Telugu,English,Hindi,Tamil

5.Spinner

A spinner is a Scrollable containers from large no of with specific

containers.

example:
-------
Distict

Guntur-----

coll1

coll2

coll3

Chittoor

c1
c2
c3

Praksam

Nellore

East-Godavari

West-Godavari

Array:
array is group of or collection of items

<string_array>

<item>Guntur</item>

<item>Chittor></item>

</string-array>

RatingBar:
----------
give the user feedback at partuclar application .

1.2

3.4

ProgressDialogue:
----------------

ProgressDialogue -View


SeekBar:(View)
-------

Example:high medium low for brightness checking purspose.

Switch:
------
switch having two states

1.ON

2.OFF


View Hirarchy in XML Formate
-----------------------------

External Closing Implementation:


text will be called as-property name
""-will be called property value

Mandatory properties in views:
----------------------------

<Textview

width="match_parent"

heigth="warp_content"

text="SVEC"

textcolor="#000"

textsize="30sp">

</Tiewview>


EditTextImplementation in Xml:
------------------------------
<EditeText

hint="Enter Your Name"

textsize="20sp"

inputtype="phone|numberpassword|text|textemailaddress"

textcolorhint="#000"

>

Note:text size will be declared in sp mode.

width and height will be declared in dp mode.

sp-scale independent pixel

dp-dependent independent pixel


</EditText>


ViewGroups:
----------
>ViewGroup is Ui Component.

>ViewGroup is not visible.

>ViewGroup will be declared external closing only.


ViewGroup Mandatory Properties:
------------------------------

<ViewGroup
width
height
orientation="Vertical/horizontal"
>


</ViewGroup>

ViewGroup Types:
----------------
1.LinearLayout

2.RelativeLayout.

3.ConstarintLayout

4.TableLayout

5.GridLayout

6.Stragged GridLayout.


ViewGroup And Views Implemented In XML Formate
---------------------------------------------

<LinearLayout

width="macth_parent"
height="wrap_content"
orientation="vertical"

>


<Textview
text="APSSDC ANDROID APP DEVELOEPEMENT"
textsize="30sp|40sp"
textcolor="#000"
>
<Textview
text="APSSDC DataScinece Tool"
textsize="30sp|40sp"
textcolor="#000"
>

<Textview
text="APSSDC Python"
textsize="30sp|40sp"
textcolor="#000"
>


</TextView>

</LinearLayout>


How to Run The Mobile App In Android Studio IDE:
------------------------------------------------

there are three ways run the application in our Android Studio.


1.By Using Mobile Phone.

2.By Using Emulator.

3.Build An Apk.


.java

.apk file


How to Enable The Developer Options In Our Mobile Phone:
--------------------------------------------------------
1.goto settings

2.select the about phone option.

3.select an build number press on 7 times then only developer options is enable.

4.go for developer options.

5.your mobile files will transfer mode only.

4.After selecting the developer options click on Enable Usb Degugging .

5.your mobile phone with the help of usb connect with laptop.

6.there two options visible on your mobile (i,e) allow|deny

select allow option.

7.after selecting the allow option automatically your mobile model name 


will be replacted in our android studio ide.

8.by using android studio ide top side corner run option will visible.

9.click the run option launch the application in mobile phone in realtime manner.



3.By Using Buil Apk.

>select the android studio top side Build option is visible click on build option.

after click on build >build analyzer apk.

the apk will be located in local computer.

copy the apk file to in our mobile phone folder.

then go for file manager.

select the apk folder.

click on apk install in our mobile application.


























dp implementation in view:
-------------------------

width="200dp"

height="200dp".

<TextView
text="SVEC COLLEGE"
>
</Textview>

Internal Closing Implementation:
--------------------------------

<TextView/>




>>Onclick Events On Views

>>Android Project Structure

>>Sample HelloWorld Project Creation














http://engineering.apssdc.in/


5.Android HelloToast Application.

6.Intents And Their Types

1.Explicit Intents.

>With the help explicit intent we can navigate one screen to

another screen.

>intent is a class

>Intent has starting starts with upper case letter.

>Intent will be denoted as shown below

Example:Intent 

Syntax:
------
Intent intentobj=new Intent(sourceaddress.this,destinationaddress.class)

startActivity(intentobj);

sourceaddress means-current class object.

destinationaddress means-activity name.

MainActivity-Source Address

Second-destination address


2.Implicit Intents.
------------------
with the help of implicit intent 
we can navigate searchengines like google,yahool,gmail----

in our activity to display the ui screen.

example:dial

we can create the implicit intent with the help

Uri class .

example:1
-------
Uri uri=Uri.parse("http://www.google.com");

Intent i=new Intent(Intent.ACTION_VIEW,uri);

startactivity(i);

Example:2
--------
Uri uri=Uri.parse("tel:9848431016");

Intent i1=new Intent(Intent.ACTION_DIAL,uri);

startactivity(i);


ScrollView:
-----------
Scrollview is one of the viewgroup.

Scrollview is not visible.

Scrollview is applicable to Main Root Layout.

mandatory properties for scrollview
------------------------------------
1.android:layout_width="match_parent"
2.android:layout_height="match_parent"


OptionsMenu:
-----------
with the help options menu we can navigate one activity

to corresponding activity.

steps to create an option menu:
===============================
1.create menu directory with res
folder.

2.create menu resource file.

3.add the menu items at menu resource file

4.to inflate menu xml file at mainactivity with
the help of oncreateOptionsMenu(Menu menu) override method.

getmenuinflater().inflater(R.menu.options_menu,menu)


steps to implement the oclick listerners Options

menu:
-------------------------------------------------
OnOptionsItemSelected()-Override methods

Each and Every menu having some unique value(id).

with the help of menu 
>to create the Toast message.
>to implement the explicit intent.
>to implement the implicit intent.
>to implement the share intent.
>to implement the menu icon.
>to implement menu catagary with the help of
 android:ordercategery="1"




7.Alert Dialogue Application

8.DatePicker Dialogue

9.TimePicker Dialogue

10.UserInput Controlls With Registration Page.

11.DataParsing Between Two Activitys.

12.OptionsMenu Creation.

13.Context Menu Creation.

14.Tabs Navigation.(Whatsup) Application.

15.Recyclerview(Contacts Application).

16.Connect To the Internet(Retrofit Library).

17.Notifications Application.

18.Services Application(MusicPlayer).

19.BroadCast Recivers.

a.System BroadCast Receivers

b.Custom BroadCast Receivers.

20.SharedPreferences.

21.JobSchedular with WorkManager

22.Room DataBase.
