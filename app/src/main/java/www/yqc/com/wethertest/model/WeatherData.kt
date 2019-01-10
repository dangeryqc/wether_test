package www.yqc.com.wethertest.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Administrator on 2019/1/9.
 */
class WeatherData {
    /**
     * resultcode : 200
     * reason : 查询成功
     * result : {"sk":{"temp":"3","wind_direction":"北风","wind_strength":"2级","humidity":"100%","time":"13:27"},"today":{"temperature":"0℃~2℃","weather":"雨夹雪转小雨","weather_id":{"fa":"06","fb":"07"},"wind":"北风微风","week":"星期三","city":"麻城","date_y":"2019年01月09日","dressing_index":"冷","dressing_advice":"天气冷，建议着棉服、羽绒服、皮夹克加羊毛衫等冬季服装。年老体弱者宜着厚棉衣、冬大衣或厚羽绒服。","uv_index":"最弱","comfort_index":"","wash_index":"不宜","travel_index":"较不宜","exercise_index":"较不宜","drying_index":""},"future":{"day_20190109":{"temperature":"0℃~2℃","weather":"雨夹雪转小雨","weather_id":{"fa":"06","fb":"07"},"wind":"北风微风","week":"星期三","date":"20190109"},"day_20190110":{"temperature":"2℃~5℃","weather":"小雨","weather_id":{"fa":"07","fb":"07"},"wind":"北风微风","week":"星期四","date":"20190110"},"day_20190111":{"temperature":"1℃~6℃","weather":"小雨转阴","weather_id":{"fa":"07","fb":"02"},"wind":"西北风微风","week":"星期五","date":"20190111"},"day_20190112":{"temperature":"2℃~7℃","weather":"阴转多云","weather_id":{"fa":"02","fb":"01"},"wind":"西风微风","week":"星期六","date":"20190112"},"day_20190113":{"temperature":"3℃~12℃","weather":"多云","weather_id":{"fa":"01","fb":"01"},"wind":"北风微风","week":"星期日","date":"20190113"},"day_20190114":{"temperature":"2℃~7℃","weather":"阴转多云","weather_id":{"fa":"02","fb":"01"},"wind":"西风微风","week":"星期一","date":"20190114"},"day_20190115":{"temperature":"1℃~6℃","weather":"小雨转阴","weather_id":{"fa":"07","fb":"02"},"wind":"西北风微风","week":"星期二","date":"20190115"}}}
     * error_code : 0
     */

    var resultcode: String? = null
    var reason: String? = null
    var result: ResultBean? = null
    var error_code: Int = 0

    class ResultBean {
        /**
         * sk : {"temp":"3","wind_direction":"北风","wind_strength":"2级","humidity":"100%","time":"13:27"}
         * today : {"temperature":"0℃~2℃","weather":"雨夹雪转小雨","weather_id":{"fa":"06","fb":"07"},"wind":"北风微风","week":"星期三","city":"麻城","date_y":"2019年01月09日","dressing_index":"冷","dressing_advice":"天气冷，建议着棉服、羽绒服、皮夹克加羊毛衫等冬季服装。年老体弱者宜着厚棉衣、冬大衣或厚羽绒服。","uv_index":"最弱","comfort_index":"","wash_index":"不宜","travel_index":"较不宜","exercise_index":"较不宜","drying_index":""}
         * future : {"day_20190109":{"temperature":"0℃~2℃","weather":"雨夹雪转小雨","weather_id":{"fa":"06","fb":"07"},"wind":"北风微风","week":"星期三","date":"20190109"},"day_20190110":{"temperature":"2℃~5℃","weather":"小雨","weather_id":{"fa":"07","fb":"07"},"wind":"北风微风","week":"星期四","date":"20190110"},"day_20190111":{"temperature":"1℃~6℃","weather":"小雨转阴","weather_id":{"fa":"07","fb":"02"},"wind":"西北风微风","week":"星期五","date":"20190111"},"day_20190112":{"temperature":"2℃~7℃","weather":"阴转多云","weather_id":{"fa":"02","fb":"01"},"wind":"西风微风","week":"星期六","date":"20190112"},"day_20190113":{"temperature":"3℃~12℃","weather":"多云","weather_id":{"fa":"01","fb":"01"},"wind":"北风微风","week":"星期日","date":"20190113"},"day_20190114":{"temperature":"2℃~7℃","weather":"阴转多云","weather_id":{"fa":"02","fb":"01"},"wind":"西风微风","week":"星期一","date":"20190114"},"day_20190115":{"temperature":"1℃~6℃","weather":"小雨转阴","weather_id":{"fa":"07","fb":"02"},"wind":"西北风微风","week":"星期二","date":"20190115"}}
         */

        var sk: SkBean? = null
        var today: TodayWeather? = null
        var future: FutureWeather? = null

        class SkBean {
            /**
             * temp : 3
             * wind_direction : 北风
             * wind_strength : 2级
             * humidity : 100%
             * time : 13:27
             */

            var temp: String? = null
            var wind_direction: String? = null
            var wind_strength: String? = null
            var humidity: String? = null
            var time: String? = null
        }

        class TodayWeather {
            /**
             * temperature : 0℃~2℃
             * weather : 雨夹雪转小雨
             * weather_id : {"fa":"06","fb":"07"}
             * wind : 北风微风
             * week : 星期三
             * city : 麻城
             * date_y : 2019年01月09日
             * dressing_index : 冷
             * dressing_advice : 天气冷，建议着棉服、羽绒服、皮夹克加羊毛衫等冬季服装。年老体弱者宜着厚棉衣、冬大衣或厚羽绒服。
             * uv_index : 最弱
             * comfort_index :
             * wash_index : 不宜
             * travel_index : 较不宜
             * exercise_index : 较不宜
             * drying_index :
             */

            var temperature: String? = null
            var weather: String? = null
            var weather_id: WeatherIdBean? = null
            var wind: String? = null
            var week: String? = null
            var city: String? = null
            var date_y: String? = null
            var dressing_index: String? = null
            var dressing_advice: String? = null
            var uv_index: String? = null
            var comfort_index: String? = null
            var wash_index: String? = null
            var travel_index: String? = null
            var exercise_index: String? = null
            var drying_index: String? = null

            class WeatherIdBean {
                /**
                 * fa : 06
                 * fb : 07
                 */

                var fa: String? = null
                var fb: String? = null
            }
        }

        class FutureWeather {
            /**
             * day_20190109 : {"temperature":"0℃~2℃","weather":"雨夹雪转小雨","weather_id":{"fa":"06","fb":"07"},"wind":"北风微风","week":"星期三","date":"20190109"}
             * day_20190110 : {"temperature":"2℃~5℃","weather":"小雨","weather_id":{"fa":"07","fb":"07"},"wind":"北风微风","week":"星期四","date":"20190110"}
             * day_20190111 : {"temperature":"1℃~6℃","weather":"小雨转阴","weather_id":{"fa":"07","fb":"02"},"wind":"西北风微风","week":"星期五","date":"20190111"}
             * day_20190112 : {"temperature":"2℃~7℃","weather":"阴转多云","weather_id":{"fa":"02","fb":"01"},"wind":"西风微风","week":"星期六","date":"20190112"}
             * day_20190113 : {"temperature":"3℃~12℃","weather":"多云","weather_id":{"fa":"01","fb":"01"},"wind":"北风微风","week":"星期日","date":"20190113"}
             * day_20190114 : {"temperature":"2℃~7℃","weather":"阴转多云","weather_id":{"fa":"02","fb":"01"},"wind":"西风微风","week":"星期一","date":"20190114"}
             * day_20190115 : {"temperature":"1℃~6℃","weather":"小雨转阴","weather_id":{"fa":"07","fb":"02"},"wind":"西北风微风","week":"星期二","date":"20190115"}
             */
            @SerializedName("day_20190109")
            var firstDay: FirstDayWeather? = null
            @SerializedName("day_20190110")
            var secondDay: SecondDayWeather? = null
            @SerializedName("day_20190111")
            var thirdDay: ThirdDayWeather? = null
            @SerializedName("day_20190112")
            var fourthDay: FourthDayWeather? = null
            @SerializedName("day_20190113")
            var fifthDay: FifthDayWeather? = null
            @SerializedName("day_20190114")
            var sixthDay: SixthDayWeather? = null
            @SerializedName("day_20190115")
            var seventhDay: SeventhDayWeather? = null

            class FirstDayWeather {
                /**
                 * temperature : 0℃~2℃
                 * weather : 雨夹雪转小雨
                 * weather_id : {"fa":"06","fb":"07"}
                 * wind : 北风微风
                 * week : 星期三
                 * date : 20190109
                 */

                var temperature: String? = null
                var weather: String? = null
                var weather_id: WeatherIdBeanX? = null
                var wind: String? = null
                var week: String? = null
                var date: String? = null

                class WeatherIdBeanX {
                    /**
                     * fa : 06
                     * fb : 07
                     */

                    var fa: String? = null
                    var fb: String? = null
                }
            }

            class SecondDayWeather {
                /**
                 * temperature : 2℃~5℃
                 * weather : 小雨
                 * weather_id : {"fa":"07","fb":"07"}
                 * wind : 北风微风
                 * week : 星期四
                 * date : 20190110
                 */

                var temperature: String? = null
                var weather: String? = null
                var weather_id: WeatherIdBeanXX? = null
                var wind: String? = null
                var week: String? = null
                var date: String? = null

                class WeatherIdBeanXX {
                    /**
                     * fa : 07
                     * fb : 07
                     */

                    var fa: String? = null
                    var fb: String? = null
                }
            }

            class ThirdDayWeather {
                /**
                 * temperature : 1℃~6℃
                 * weather : 小雨转阴
                 * weather_id : {"fa":"07","fb":"02"}
                 * wind : 西北风微风
                 * week : 星期五
                 * date : 20190111
                 */

                var temperature: String? = null
                var weather: String? = null
                var weather_id: WeatherIdBeanXXX? = null
                var wind: String? = null
                var week: String? = null
                var date: String? = null

                class WeatherIdBeanXXX {
                    /**
                     * fa : 07
                     * fb : 02
                     */

                    var fa: String? = null
                    var fb: String? = null
                }
            }

            class FourthDayWeather {
                /**
                 * temperature : 2℃~7℃
                 * weather : 阴转多云
                 * weather_id : {"fa":"02","fb":"01"}
                 * wind : 西风微风
                 * week : 星期六
                 * date : 20190112
                 */

                var temperature: String? = null
                var weather: String? = null
                var weather_id: WeatherIdBeanXXXX? = null
                var wind: String? = null
                var week: String? = null
                var date: String? = null

                class WeatherIdBeanXXXX {
                    /**
                     * fa : 02
                     * fb : 01
                     */

                    var fa: String? = null
                    var fb: String? = null
                }
            }

            class FifthDayWeather {
                /**
                 * temperature : 3℃~12℃
                 * weather : 多云
                 * weather_id : {"fa":"01","fb":"01"}
                 * wind : 北风微风
                 * week : 星期日
                 * date : 20190113
                 */

                var temperature: String? = null
                var weather: String? = null
                var weather_id: WeatherIdBeanXXXXX? = null
                var wind: String? = null
                var week: String? = null
                var date: String? = null

                class WeatherIdBeanXXXXX {
                    /**
                     * fa : 01
                     * fb : 01
                     */

                    var fa: String? = null
                    var fb: String? = null
                }
            }

            class SixthDayWeather {
                /**
                 * temperature : 2℃~7℃
                 * weather : 阴转多云
                 * weather_id : {"fa":"02","fb":"01"}
                 * wind : 西风微风
                 * week : 星期一
                 * date : 20190114
                 */

                var temperature: String? = null
                var weather: String? = null
                var weather_id: WeatherIdBeanXXXXXX? = null
                var wind: String? = null
                var week: String? = null
                var date: String? = null

                class WeatherIdBeanXXXXXX {
                    /**
                     * fa : 02
                     * fb : 01
                     */

                    var fa: String? = null
                    var fb: String? = null
                }
            }

            class SeventhDayWeather {
                /**
                 * temperature : 1℃~6℃
                 * weather : 小雨转阴
                 * weather_id : {"fa":"07","fb":"02"}
                 * wind : 西北风微风
                 * week : 星期二
                 * date : 20190115
                 */

                var temperature: String? = null
                var weather: String? = null
                var weather_id: WeatherIdBeanXXXXXXX? = null
                var wind: String? = null
                var week: String? = null
                var date: String? = null

                class WeatherIdBeanXXXXXXX {
                    /**
                     * fa : 07
                     * fb : 02
                     */

                    var fa: String? = null
                    var fb: String? = null
                }
            }
        }
    }

    override fun toString(): String {
        return resultcode+"---"+reason
    }

}