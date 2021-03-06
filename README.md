# __KillTrees__ is Minecraft Spigot Plugin

| 対応バージョン | ダウンロード |
| :------------: | :----------: |
| spigot-1.11.*  | [KillTrees-1.0.jar](https://github.com/MasahiroSaito/KillTrees/raw/master/com/MasahiroSaito/Spigot/KillTrees/1.0/KillTrees-1.0.jar) |

## 特徴

このプラグインには、他の木こりプラグインには無い様々な特徴があります。

### 設定が日本語に対応

設定ファイルは __日本語で説明が書かれています__ ！

![](https://www.evernote.com/l/As3uv_Aubo5Jdqdq-99hLxNo1cVsDQ5PofcB/image.png)


### 拡張が可能

プラグイン内の各処理をイベント化させることによって、そのイベントを専用のリスナーでフックし処理を追加することができるようになりました。ですので、プラグイン作成者は __このプラグインを拡張するプラグインが簡単に作れます__ ！

| 発火順番 | イベント名                | 説明                                                   |
| :------: | :------------------------ | :----------------------------------------------------- |
|     1    | TreeKillEvent             | このプラグインの処理の最初の発火イベント               |
|     2    | CalcBreakBlock            | 破壊するブロックを計算するイベント                     |
|     3    | CheckToolBreakEvent       | 道具が壊れるかどうか判定するイベント                   |
|     4    | ReduceBreakBlockEvent     | 道具の耐久値に合わせて壊すブロック数を減らすイベント   |
|     5    | BreakBlocksEvent          | ブロックを破壊するイベント                             |
|     6    | ChangeToolDurabilityEvent | 壊したブロック数に応じて道具の耐久値を変更するイベント |
|     7    | BreakToolEvent            | 道具を破壊するイベント                                 |
|     8    | TreeKillMessageEvent      | プレイヤーにメッセージを表示するイベント               |

## 設定の変え方

このプラグインを導入したサーバーを起動すると、`killtrees.KillTrees` というフォルダが生成され、その中に `killtrees.config.json` という名前の設定ファイルも生成されます。このファイルをテキストエディタなどで開き、値を書き換えることで __簡単に設定を変えることができます__ !
