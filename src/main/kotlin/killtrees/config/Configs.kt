package killtrees.config

import com.google.gson.annotations.SerializedName

data class Configs(

        @SerializedName("クリエイティブモード時に道具の耐久値を減らす")
        val onCreativeDurabilityReduce: Boolean = false,

        @SerializedName("道具の耐久値と壊したブロックの数を表示する")
        val onToolDurabilityMsg: Boolean = true,

        @SerializedName("一度に壊せるブロック数の上限")
        val maxBlockAmount: Int = 200,

        @SerializedName("破壊する隣接ブロックの距離")
        val rangeBreakBlock: Int = 1
)