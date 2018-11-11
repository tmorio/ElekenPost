# KeyNotePost-Android
鍵の貸出、返却報告を簡単にするアプリケーション  
...と言う名のSlackに定型文を送るAndroidアプリです。5秒に一回ボタン押せます。(連打対策)

## 制作経緯
所属している部活が鍵を借りたり返したときに、Slackに毎度報告する必要があるのですが、毎回定型文を入力するので面倒だったからです。

## 動作原理
Slack Web APIに必要なパラメータをつけて投げているだけです。

## 使い方
1. KeyNotePost-Android/app/src/main/java/com/moritoworks/elekenkeytool/にある、「AsyncTaskGet.java」と「AsyncTaskReturn.java」に以下のような記載があるので、"xxxx-xxx"にSlack APIキー、"app-test"にチャンネル名、"ElekenPost - Debug"に発信者名、"鍵借りた"にPostするメッセージを入れる。

```java
PostMessage.send("xxxx-xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "app-test", "ElekenPost - Debug", "鍵借りた");
```
  
2.ビルドしてインストール  
3.動作確認してうまくPostされたら完成。必要に応じてAndroid StudioでUIやボタンラベルを変えて下さい。
