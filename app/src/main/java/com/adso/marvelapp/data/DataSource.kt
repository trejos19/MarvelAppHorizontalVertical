package com.adso.marvelapp.data

import com.adso.marvelapp.model.Superheroe

class DataSource {

    fun getSuperHeroe():MutableList<Superheroe>{
        var superheroe:MutableList<Superheroe> = mutableListOf()
        superheroe.add(Superheroe("Spiderman","Marvel","Peter Parker","https://i.pinimg.com/736x/87/65/c1/8765c111d0b035b8f75818dc2b569c06.jpg"))
        superheroe.add(Superheroe("Deadpool","Marvel","Wade Winston","https://e7.pngegg.com/pngimages/810/94/png-clipart-deadpool-negasonic-teenage-warhead-film-20th-century-fox-others-superhero-meme-thumbnail.png"))
        superheroe.add(Superheroe("Iron Man","Marvel","Anthony Edward Stark","https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/60b07d97484755.5ec610dc12fe4.jpg"))
        superheroe.add(Superheroe("Hulk","Marvel","Bruce Banner","https://i.imgflip.com/1g1bl3.jpg?a475872"))
        superheroe.add(Superheroe("Thor","Marvel","Thor Odinson","https://peru21.pe/resizer/jrfCoHq8m-WWGwR00c4WElFpoKs=/1200x800/smart/filters:format(jpeg):quality(75)/arc-anglerfish-arc2-prod-elcomercio.s3.amazonaws.com/public/RUBVMMDVIBBI7IQROZKR4KHEZI.jpg"))
        superheroe.add(Superheroe("Capitan America","Marvel","Steven Rogers","https://i.pinimg.com/736x/a8/e4/b2/a8e4b29d2ac8dfdd13320f72e027e30a.jpg"))
        superheroe.add(Superheroe("Antman","Marvel","Scott Lang","https://pyxis.nymag.com/v1/imgs/311/202/42cc3c51ea5be30f658fd4d8331eafa0db-27-ant-man-wasp.rsquare.w400.jpg"))


        return superheroe
    }
}