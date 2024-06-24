TextView textView1 = findViewById(R.id.textView1);
TextView textView2 = findViewById(R.id.textView2);
TextView concatenatedTextView = findViewById(R.id.concatenatedTextView);

String text1 = textView1.getText().toString();
String text2 = textView2.getText().toString();

String concatenatedText = text1 + text2;

concatenatedTextView.setText(concatenatedText);
