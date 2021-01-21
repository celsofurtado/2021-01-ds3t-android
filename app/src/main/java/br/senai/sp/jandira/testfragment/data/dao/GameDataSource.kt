package br.senai.sp.jandira.testfragment.data.dao

import android.content.Context
import br.senai.sp.jandira.testfragment.R
import br.senai.sp.jandira.testfragment.model.Console
import br.senai.sp.jandira.testfragment.model.Game

class GameDataSource {

    companion object {
        fun getGames(context: Context) : ArrayList<Game> {
            var games = ArrayList<Game>()

            games.add(Game(
                1,
                "Mortal Kombat",
                context.getDrawable(R.drawable.mortal)!!,
                "Mortal Kombat é um jogo bem legal!",
                4.5,
                listOf(
                    Console(1, "PlayStation 1", "Sony", "1996-12-01"),
                    Console(2, "SNes", "Nintendo", "1990-12-05"),
                    Console(3, "X-box 360", "Microsoft", "2008-12-15")
                ))
            )

            games.add(Game(
                2,
                "Contra 3",
                context.getDrawable(R.drawable.contra3)!!,
                "Mortal Kombat é um jogo bem legal!",
                4.5,
                listOf(
                    Console(1, "Switch", "Nintendo", "2017-12-01")))
            )

            games.add(Game(
                2,
                "Contra 3",
                context.getDrawable(R.drawable.contra3)!!,
                "Mortal Kombat é um jogo bem legal!",
                4.5,
                listOf(
                    Console(1, "Switch", "Nintendo", "2017-12-01")))
            )

            games.add(Game(
                2,
                "Contra 3",
                context.getDrawable(R.drawable.contra3)!!,
                "Mortal Kombat é um jogo bem legal!",
                4.5,
                listOf(
                    Console(1, "Switch", "Nintendo", "2017-12-01")))
            )

            return games

        }
    }

}