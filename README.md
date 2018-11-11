# KeyNotePost-Android
鍵の貸出、返却報告を簡単にするアプリケーション

## 使い方
1. KeyNotePost-Android/app/src/main/java/com/moritoworks/elekenkeytool/にある、「AsyncTaskGet.java」と「AsyncTaskReturn.java」に以下のような記載があるので、"xxxx-xxx"にSlack APIキー、"app-test"にチャンネル名、"ElekenPost - Debug"に発信者名、"鍵借りた"にPostするメッセージを入れる。

```java
PostMessage.send("xxxx-xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "app-test", "ElekenPost - Debug", "鍵借りた");
```
  
2.ビルドしてインストール  
3.動作確認してうまくPostされたら完成。必要に応じてAndroid StudioでUIやボタンラベルを変えて下さい。
