package com.example.nestedrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.nestedrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var genreAdapter:GenreAdapter? = null
    private var genres:ArrayList<GenreModel>? = null
    private var binding: ActivityMainBinding? = null
    private var movieAdapter:MovieAdapter? = null
    private var movies:ArrayList<MovieModel>? = null

    private var actionMovies:ArrayList<MovieModel>? = null
    private var fantasticMovies:ArrayList<MovieModel>? = null
    private var adventureMovies:ArrayList<MovieModel>? = null
    private var thrillerMovies:ArrayList<MovieModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        movies = ArrayList<MovieModel>()

        genres = ArrayList<GenreModel>()
        actionMovies = ArrayList<MovieModel>()
        fantasticMovies = ArrayList<MovieModel>()
        adventureMovies = ArrayList<MovieModel>()
        thrillerMovies = ArrayList<MovieModel>()


        genres?.add(GenreModel( getString(R.string.actionMovies), actionMovies!!))
        genres?.add(
            GenreModel(getString(R.string.fantasticMovies), fantasticMovies!!)
        )

        genres?.add(
            GenreModel(getString(R.string.adventureMovies), adventureMovies!!)
        )

        genres?.add(
            GenreModel(getString(R.string.thrillerMovies), thrillerMovies!!)
        )

        actionMovies?.add(MovieModel(R.drawable.shreck1, getString(R.string.shreck1), getString(R.string.Long1),
            getString(R.string.shreck1Actors), getString(R.string.shreck1Rating)))
        adventureMovies?.add(
            MovieModel(R.drawable.shreck2, getString(R.string.shreck2), getString(R.string.Long2),
                getString(R.string.shreck2Actors), getString(R.string.shreck2Rating))
        )
        actionMovies?.add(
            MovieModel(R.drawable.shreck3, getString(R.string.shreck3), getString(R.string.Long3),
                getString(R.string.shreck3Actors), getString(R.string.shreck3Rating))
        )
        adventureMovies?.add(
            MovieModel(R.drawable.shreck4, getString(R.string.shreck4), getString(R.string.Long4),
                getString(R.string.shreck4Actors), getString(R.string.shreck4Rating))
        )
        actionMovies?.add(
            MovieModel(R.drawable.shreck5, getString(R.string.shreck5), getString(R.string.Long5),
                getString(R.string.shreck5Actors), getString(R.string.shreck5Rating))
        )
        adventureMovies?.add(
            MovieModel(R.drawable.shreck6, getString(R.string.shreck6), getString(R.string.Long6),
                getString(R.string.shreck6Actors), getString(R.string.shreck6Rating))
        )


        fantasticMovies?.add(
            MovieModel(R.drawable.shreck2, getString(R.string.shreck2), getString(R.string.Long2),
                getString(R.string.shreck2Actors), getString(R.string.shreck2Rating))
        )
        fantasticMovies?.add(
            MovieModel(R.drawable.shreck3, getString(R.string.shreck3), getString(R.string.Long3),
                getString(R.string.shreck3Actors), getString(R.string.shreck3Rating ))
        )
        fantasticMovies?.add(
            MovieModel(R.drawable.shreck5, getString(R.string.shreck5), getString(R.string.Long5),
                getString(R.string.shreck5Actors), getString(R.string.shreck5Rating))
        )
        fantasticMovies?.add(
            MovieModel(R.drawable.shreck6, getString(R.string.shreck6), getString(R.string.Long6),
                getString(R.string.shreck6Actors), getString(R.string.shreck6Rating))
        )

        adventureMovies?.add(
            MovieModel(R.drawable.shreck7, getString(R.string.shreck7), getString(R.string.Long7),
                getString(R.string.shreck7Actors), getString(R.string.shreck7Rating))
        )
        adventureMovies?.add(
            MovieModel(R.drawable.shreck8, getString(R.string.shreck8), getString(R.string.Long8),
                getString(R.string.shreck8Actors), getString(R.string.shreck8Rating))
        )

        thrillerMovies?.add(MovieModel(R.drawable.shreck6, getString(R.string.shreck6), getString(R.string.Long6),
            getString(R.string.shreck6Actors), getString(R.string.shreck6Rating)))

        binding?.genresMovies?.layoutManager = LinearLayoutManager(this)
        genreAdapter = GenreAdapter(this, genres!!)
        binding?.genresMovies?.adapter = genreAdapter
    }


    private fun action(movieModel: MovieModel) {

        val detailsMovie = DetailsMovie()
        val parameters = Bundle()
        parameters.putString("nameMovie", movieModel.nameMovie)
        parameters.putString("longMovie", movieModel.longMovie)
        parameters.putString("actorsMovie", movieModel.actorsMovie)
        parameters.putString("ratingMovie", movieModel.ratingMovie)

        detailsMovie.arguments = parameters

        detailsMovie.show(supportFragmentManager, "details")

    }


}