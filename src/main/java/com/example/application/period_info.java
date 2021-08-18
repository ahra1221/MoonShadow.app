<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".MainActivity">

    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="10dp"
        android:layout_marginLeft="20dp"
        android:layout_marginTop="50dp"
        android:layout_marginBottom="10dp"
        android:orientation="horizontal">

        <ImageView
            android:id="@+id/imageView"
            android:layout_width="88dp"
            android:layout_height="match_parent"
            android:layout_marginLeft="5dp"
            android:layout_weight="1"
            android:src="@drawable/girl" />

        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="10dp"
            android:layout_marginBottom="10dp"
            android:gravity="left"
            android:text="눈송이"
            android:textSize="20sp"
            android:textStyle="bold" />

        <TextView
            android:id="@+id/textView2"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="10dp"
            android:layout_marginBottom="10dp"
            android:layout_weight="1"
            android:gravity="left"
            android:text="님의 생리정보"
            android:textSize="20sp"
            android:textStyle="bold" />

    </LinearLayout>

    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="10dp"
        android:layout_marginLeft="10dp"
        android:layout_marginBottom="5dp"
        android:orientation="horizontal"
        android:padding="0dp">

        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginLeft="20dp"
            android:layout_marginBottom="10dp"
            android:gravity="center"
            android:text="생리 평균 일수"
            android:textSize="16sp" />

        <EditText
            android:id="@+id/et_day"
            android:layout_width="50dp"
            android:layout_height="40dp"
            android:layout_marginLeft="50dp"
            android:layout_weight="1"
            android:ems="10"
            android:gravity="center"
            android:inputType="number"
            android:textSize="16sp"
            tools:ignore="TouchTargetSizeCheck" />

        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:gravity="center"
            android:text="일"
            android:textSize="16sp" />

    </LinearLayout>

    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="10dp"
        android:layout_marginLeft="10dp"
        android:layout_marginBottom="5dp"
        android:orientation="horizontal"
        android:padding="0dp">

        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginLeft="20dp"
            android:layout_marginBottom="10dp"
            android:gravity="center"
            android:text="생리 평균 주기"
            android:textSize="16sp" />

        <EditText
            android:id="@+id/et_period"
            android:layout_width="50dp"
            android:layout_height="40dp"
            android:layout_marginLeft="50dp"
            android:ems="10"
            android:gravity="center"
            android:inputType="number" />

        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:gravity="center"
            android:text="주"
            android:textSize="16sp" />

    </LinearLayout>

    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="10dp"
        android:layout_marginLeft="10dp"
        android:layout_marginBottom="5dp"
        android:orientation="horizontal"
        android:padding="0dp">

        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginLeft="20dp"
            android:layout_marginTop="10dp"
            android:gravity="center"
            android:text="일별 생리양"
            android:textSize="16sp" />

    </LinearLayout>

    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="10dp"
        android:layout_marginLeft="10dp"
        android:layout_marginBottom="5dp"
        android:orientation="horizontal"
        android:padding="0dp">

        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginLeft="20dp"
            android:layout_marginBottom="10dp"
            android:gravity="center"
            android:text="1일차"
            android:textSize="16sp" />

        <EditText
            android:id="@+id/editTextTextPersonName2"
            android:layout_width="150dp"
            android:layout_height="40dp"
            android:layout_marginLeft="50dp"
            android:layout_weight="1"
            android:ems="10"
            android:gravity="left"
            android:inputType="textPersonName" />

    </LinearLayout>

    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="10dp"
        android:layout_marginLeft="10dp"
        android:layout_marginBottom="5dp"
        android:orientation="horizontal"
        android:padding="0dp">

        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginLeft="20dp"
            android:layout_marginBottom="10dp"
            android:gravity="center"
            android:text="2일차"
            android:textSize="16sp" />

        <EditText
            android:id="@+id/editTextTextPersonName3"
            android:layout_width="150dp"
            android:layout_height="40dp"
            android:layout_marginLeft="50dp"
            android:layout_weight="1"
            android:ems="10"
            android:inputType="textPersonName" />

    </LinearLayout>

    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="10dp"
        android:layout_marginLeft="10dp"
        android:layout_marginBottom="5dp"
        android:orientation="horizontal"
        android:padding="0dp">

        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginLeft="20dp"
            android:layout_marginBottom="10dp"
            android:gravity="center"
            android:text="3일차"
            android:textSize="16sp" />

        <EditText
            android:id="@+id/editTextTextPersonName4"
            android:layout_width="150dp"
            android:layout_height="40dp"
            android:layout_marginLeft="50dp"
            android:layout_weight="1"
            android:ems="10"
            android:inputType="textPersonName" />

    </LinearLayout>

    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="10dp"
        android:layout_marginLeft="10dp"
        android:layout_marginBottom="5dp"
        android:orientation="horizontal"
        android:padding="0dp">

        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginLeft="20dp"
            android:layout_marginBottom="10dp"
            android:gravity="center"
            android:text="4일차"
            android:textSize="16sp" />

        <EditText
            android:id="@+id/editTextTextPersonName5"
            android:layout_width="150dp"
            android:layout_height="40dp"
            android:layout_marginLeft="50dp"
            android:layout_weight="1"
            android:ems="10"
            android:inputType="textPersonName" />

    </LinearLayout>

    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="10dp"
        android:layout_marginLeft="10dp"
        android:layout_marginBottom="5dp"
        android:orientation="horizontal"
        android:padding="0dp">

        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginLeft="20dp"
            android:layout_marginBottom="10dp"
            android:gravity="center"
            android:text="5일차"
            android:textSize="16sp" />

        <EditText
            android:id="@+id/editTextTextPersonName6"
            android:layout_width="150dp"
            android:layout_height="40dp"
            android:layout_marginLeft="50dp"
            android:layout_weight="1"
            android:ems="10"
            android:inputType="textPersonName" />

    </LinearLayout>

    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="10dp"
        android:layout_marginLeft="10dp"
        android:layout_marginBottom="5dp"
        android:orientation="horizontal"
        android:padding="0dp">

        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginLeft="20dp"
            android:layout_marginBottom="10dp"
            android:gravity="center"
            android:text="6일차"
            android:textSize="16sp" />

        <EditText
            android:id="@+id/editTextTextPersonName7"
            android:layout_width="150dp"
            android:layout_height="40dp"
            android:layout_marginLeft="50dp"
            android:layout_weight="1"
            android:ems="10"
            android:inputType="textPersonName" />

    </LinearLayout>


    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="10dp"
        android:layout_marginLeft="10dp"
        android:layout_marginBottom="5dp"
        android:orientation="horizontal"
        android:padding="0dp">

        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginLeft="20dp"
            android:layout_marginBottom="10dp"
            android:gravity="center"
            android:text="기상 시간"
            android:textSize="16sp" />

        <EditText
            android:id="@+id/et_wake"
            android:layout_width="50dp"
            android:layout_height="40dp"
            android:layout_marginLeft="50dp"
            android:layout_weight="1"
            android:ems="10"
            android:gravity="center"
            android:inputType="number" />

        <TextView
            android:id="@+id/textView4"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:gravity="center"
            android:text="시"
            android:textSize="16sp" />

    </LinearLayout>

    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="10dp"
        android:layout_marginLeft="10dp"
        android:layout_marginBottom="5dp"
        android:orientation="horizontal"
        android:padding="0dp">

        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginLeft="20dp"
            android:layout_marginBottom="10dp"
            android:gravity="center"
            android:text="취침 시간"
            android:textSize="16sp" />

        <EditText
            android:id="@+id/et_sleep"
            android:layout_width="50dp"
            android:layout_height="40dp"
            android:layout_marginLeft="50dp"
            android:layout_weight="1"
            android:ems="10"
            android:gravity="center"
            android:inputType="number" />

        <TextView
            android:id="@+id/textView6"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:gravity="center"
            android:text="시"
            android:textSize="16sp" />

    </LinearLayout>

    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginLeft="250dp"
        android:orientation="horizontal"
        android:padding="0dp">


        <Button
            android:id="@+id/button"
            android:layout_width="55dp"
            android:layout_height="wrap_content"
            android:layout_marginLeft="20dp"
            android:layout_marginTop="10dp"
            android:layout_weight="1"
            android:drawableRight="@drawable/pen_img"
            app:backgroundTint="#FDF9F9" />
    </LinearLayout>


</LinearLayout>
