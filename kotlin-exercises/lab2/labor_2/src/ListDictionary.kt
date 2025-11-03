import java.net.URL

class ListDictionary(): IDictionary {

    var list: MutableList<String>

    init{
        val url = URL("https://www.ms.sapientia.ro/~manyi/dict.txt")
        list = url.openStream().bufferedReader().readLines().toMutableList()
    }

    override fun add(string: String): Boolean {
       if(list.contains(string)){return false}

        list.add(string)
        return true
    }

    override fun find(string: String): Boolean {
        if(list.contains(string)){return true}

        return false
    }

    override fun size(): Int {
        return list.size
    }
}