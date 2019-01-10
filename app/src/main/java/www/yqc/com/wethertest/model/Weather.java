package www.yqc.com.wethertest.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Administrator on 2019/1/9.
 */

public class Weather implements Parcelable {
    /**
     * resultcode : 200
     * reason : 查询成功
     * result : {"sk":{"temp":"3","wind_direction":"东北风","wind_strength":"1级","humidity":"100%","time":"15:12"},"today":{"temperature":"0℃~2℃","weather":"雨夹雪转小雨","weather_id":{"fa":"06","fb":"07"},"wind":"北风微风","week":"星期三","city":"麻城","date_y":"2019年01月09日","dressing_index":"冷","dressing_advice":"天气冷，建议着棉服、羽绒服、皮夹克加羊毛衫等冬季服装。年老体弱者宜着厚棉衣、冬大衣或厚羽绒服。","uv_index":"最弱","comfort_index":"","wash_index":"不宜","travel_index":"较不宜","exercise_index":"较不宜","drying_index":""},"future":{"day_20190109":{"temperature":"0℃~2℃","weather":"雨夹雪转小雨","weather_id":{"fa":"06","fb":"07"},"wind":"北风微风","week":"星期三","date":"20190109"},"day_20190110":{"temperature":"2℃~5℃","weather":"小雨","weather_id":{"fa":"07","fb":"07"},"wind":"北风微风","week":"星期四","date":"20190110"},"day_20190111":{"temperature":"1℃~6℃","weather":"小雨转阴","weather_id":{"fa":"07","fb":"02"},"wind":"西北风微风","week":"星期五","date":"20190111"},"day_20190112":{"temperature":"2℃~7℃","weather":"阴转多云","weather_id":{"fa":"02","fb":"01"},"wind":"西风微风","week":"星期六","date":"20190112"},"day_20190113":{"temperature":"3℃~12℃","weather":"多云","weather_id":{"fa":"01","fb":"01"},"wind":"北风微风","week":"星期日","date":"20190113"},"day_20190114":{"temperature":"2℃~5℃","weather":"小雨","weather_id":{"fa":"07","fb":"07"},"wind":"北风微风","week":"星期一","date":"20190114"},"day_20190115":{"temperature":"2℃~5℃","weather":"小雨","weather_id":{"fa":"07","fb":"07"},"wind":"北风微风","week":"星期二","date":"20190115"}}}
     * error_code : 0
     */

    private String resultcode;
    private String reason;
    private ResultBean result;
    private int error_code;

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

    }


    public static class ResultBean {
        /**
         * sk : {"temp":"3","wind_direction":"东北风","wind_strength":"1级","humidity":"100%","time":"15:12"}
         * today : {"temperature":"0℃~2℃","weather":"雨夹雪转小雨","weather_id":{"fa":"06","fb":"07"},"wind":"北风微风","week":"星期三","city":"麻城","date_y":"2019年01月09日","dressing_index":"冷","dressing_advice":"天气冷，建议着棉服、羽绒服、皮夹克加羊毛衫等冬季服装。年老体弱者宜着厚棉衣、冬大衣或厚羽绒服。","uv_index":"最弱","comfort_index":"","wash_index":"不宜","travel_index":"较不宜","exercise_index":"较不宜","drying_index":""}
         * future : {"day_20190109":{"temperature":"0℃~2℃","weather":"雨夹雪转小雨","weather_id":{"fa":"06","fb":"07"},"wind":"北风微风","week":"星期三","date":"20190109"},"day_20190110":{"temperature":"2℃~5℃","weather":"小雨","weather_id":{"fa":"07","fb":"07"},"wind":"北风微风","week":"星期四","date":"20190110"},"day_20190111":{"temperature":"1℃~6℃","weather":"小雨转阴","weather_id":{"fa":"07","fb":"02"},"wind":"西北风微风","week":"星期五","date":"20190111"},"day_20190112":{"temperature":"2℃~7℃","weather":"阴转多云","weather_id":{"fa":"02","fb":"01"},"wind":"西风微风","week":"星期六","date":"20190112"},"day_20190113":{"temperature":"3℃~12℃","weather":"多云","weather_id":{"fa":"01","fb":"01"},"wind":"北风微风","week":"星期日","date":"20190113"},"day_20190114":{"temperature":"2℃~5℃","weather":"小雨","weather_id":{"fa":"07","fb":"07"},"wind":"北风微风","week":"星期一","date":"20190114"},"day_20190115":{"temperature":"2℃~5℃","weather":"小雨","weather_id":{"fa":"07","fb":"07"},"wind":"北风微风","week":"星期二","date":"20190115"}}
         */

        private SkBean sk;
        private TodayBean today;
        private FutureBean future;

        public SkBean getSk() {
            return sk;
        }

        public void setSk(SkBean sk) {
            this.sk = sk;
        }

        public TodayBean getToday() {
            return today;
        }

        public void setToday(TodayBean today) {
            this.today = today;
        }

        public FutureBean getFuture() {
            return future;
        }

        public void setFuture(FutureBean future) {
            this.future = future;
        }

        public static class SkBean {
            /**
             * temp : 3
             * wind_direction : 东北风
             * wind_strength : 1级
             * humidity : 100%
             * time : 15:12
             */

            private String temp;
            private String wind_direction;
            private String wind_strength;
            private String humidity;
            private String time;

            public String getTemp() {
                return temp;
            }

            public void setTemp(String temp) {
                this.temp = temp;
            }

            public String getWind_direction() {
                return wind_direction;
            }

            public void setWind_direction(String wind_direction) {
                this.wind_direction = wind_direction;
            }

            public String getWind_strength() {
                return wind_strength;
            }

            public void setWind_strength(String wind_strength) {
                this.wind_strength = wind_strength;
            }

            public String getHumidity() {
                return humidity;
            }

            public void setHumidity(String humidity) {
                this.humidity = humidity;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }

        public static class TodayBean {
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

            private String temperature;
            private String weather;
            private WeatherIdBean weather_id;
            private String wind;
            private String week;
            private String city;
            private String date_y;
            private String dressing_index;
            private String dressing_advice;
            private String uv_index;
            private String comfort_index;
            private String wash_index;
            private String travel_index;
            private String exercise_index;
            private String drying_index;

            public String getTemperature() {
                return temperature;
            }

            public void setTemperature(String temperature) {
                this.temperature = temperature;
            }

            public String getWeather() {
                return weather;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public WeatherIdBean getWeather_id() {
                return weather_id;
            }

            public void setWeather_id(WeatherIdBean weather_id) {
                this.weather_id = weather_id;
            }

            public String getWind() {
                return wind;
            }

            public void setWind(String wind) {
                this.wind = wind;
            }

            public String getWeek() {
                return week;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getDate_y() {
                return date_y;
            }

            public void setDate_y(String date_y) {
                this.date_y = date_y;
            }

            public String getDressing_index() {
                return dressing_index;
            }

            public void setDressing_index(String dressing_index) {
                this.dressing_index = dressing_index;
            }

            public String getDressing_advice() {
                return dressing_advice;
            }

            public void setDressing_advice(String dressing_advice) {
                this.dressing_advice = dressing_advice;
            }

            public String getUv_index() {
                return uv_index;
            }

            public void setUv_index(String uv_index) {
                this.uv_index = uv_index;
            }

            public String getComfort_index() {
                return comfort_index;
            }

            public void setComfort_index(String comfort_index) {
                this.comfort_index = comfort_index;
            }

            public String getWash_index() {
                return wash_index;
            }

            public void setWash_index(String wash_index) {
                this.wash_index = wash_index;
            }

            public String getTravel_index() {
                return travel_index;
            }

            public void setTravel_index(String travel_index) {
                this.travel_index = travel_index;
            }

            public String getExercise_index() {
                return exercise_index;
            }

            public void setExercise_index(String exercise_index) {
                this.exercise_index = exercise_index;
            }

            public String getDrying_index() {
                return drying_index;
            }

            public void setDrying_index(String drying_index) {
                this.drying_index = drying_index;
            }

            public static class WeatherIdBean {
                /**
                 * fa : 06
                 * fb : 07
                 */

                private String fa;
                private String fb;

                public String getFa() {
                    return fa;
                }

                public void setFa(String fa) {
                    this.fa = fa;
                }

                public String getFb() {
                    return fb;
                }

                public void setFb(String fb) {
                    this.fb = fb;
                }
            }
        }

        public static class FutureBean {
            /**
             * day_20190109 : {"temperature":"0℃~2℃","weather":"雨夹雪转小雨","weather_id":{"fa":"06","fb":"07"},"wind":"北风微风","week":"星期三","date":"20190109"}
             * day_20190110 : {"temperature":"2℃~5℃","weather":"小雨","weather_id":{"fa":"07","fb":"07"},"wind":"北风微风","week":"星期四","date":"20190110"}
             * day_20190111 : {"temperature":"1℃~6℃","weather":"小雨转阴","weather_id":{"fa":"07","fb":"02"},"wind":"西北风微风","week":"星期五","date":"20190111"}
             * day_20190112 : {"temperature":"2℃~7℃","weather":"阴转多云","weather_id":{"fa":"02","fb":"01"},"wind":"西风微风","week":"星期六","date":"20190112"}
             * day_20190113 : {"temperature":"3℃~12℃","weather":"多云","weather_id":{"fa":"01","fb":"01"},"wind":"北风微风","week":"星期日","date":"20190113"}
             * day_20190114 : {"temperature":"2℃~5℃","weather":"小雨","weather_id":{"fa":"07","fb":"07"},"wind":"北风微风","week":"星期一","date":"20190114"}
             * day_20190115 : {"temperature":"2℃~5℃","weather":"小雨","weather_id":{"fa":"07","fb":"07"},"wind":"北风微风","week":"星期二","date":"20190115"}
             */

            private Day20190110Bean day_20190110;
            private Day20190111Bean day_20190111;
            private Day20190112Bean day_20190112;
            private Day20190113Bean day_20190113;
            private Day20190114Bean day_20190114;
            private Day20190115Bean day_20190115;
            private Day20190116Bean day_20190116;

            public Day20190110Bean getDay_20190110() {
                return day_20190110;
            }

            public Day20190111Bean getDay_20190111() {
                return day_20190111;
            }

            public Day20190112Bean getDay_20190112() {
                return day_20190112;
            }

            public Day20190113Bean getDay_20190113() {
                return day_20190113;
            }

            public Day20190114Bean getDay_20190114() {
                return day_20190114;
            }

            public Day20190115Bean getDay_20190115() {
                return day_20190115;
            }

            public Day20190116Bean getDay_20190116() {
                return day_20190116;
            }


            public static class Day20190110Bean {
                /**
                 * temperature : 0℃~2℃
                 * weather : 雨夹雪转小雨
                 * weather_id : {"fa":"06","fb":"07"}
                 * wind : 北风微风
                 * week : 星期三
                 * date : 20190109
                 */

                private String temperature;
                private String weather;
                private WeatherIdBeanX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanX {
                    /**
                     * fa : 06
                     * fb : 07
                     */

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20190111Bean {
                /**
                 * temperature : 2℃~5℃
                 * weather : 小雨
                 * weather_id : {"fa":"07","fb":"07"}
                 * wind : 北风微风
                 * week : 星期四
                 * date : 20190110
                 */

                private String temperature;
                private String weather;
                private WeatherIdBeanXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXX {
                    /**
                     * fa : 07
                     * fb : 07
                     */

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20190112Bean {
                /**
                 * temperature : 1℃~6℃
                 * weather : 小雨转阴
                 * weather_id : {"fa":"07","fb":"02"}
                 * wind : 西北风微风
                 * week : 星期五
                 * date : 20190111
                 */

                private String temperature;
                private String weather;
                private WeatherIdBeanXXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXXX {
                    /**
                     * fa : 07
                     * fb : 02
                     */

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20190113Bean {
                /**
                 * temperature : 2℃~7℃
                 * weather : 阴转多云
                 * weather_id : {"fa":"02","fb":"01"}
                 * wind : 西风微风
                 * week : 星期六
                 * date : 20190112
                 */

                private String temperature;
                private String weather;
                private WeatherIdBeanXXXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXXXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXXXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXXXX {
                    /**
                     * fa : 02
                     * fb : 01
                     */

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20190114Bean {
                /**
                 * temperature : 3℃~12℃
                 * weather : 多云
                 * weather_id : {"fa":"01","fb":"01"}
                 * wind : 北风微风
                 * week : 星期日
                 * date : 20190113
                 */

                private String temperature;
                private String weather;
                private WeatherIdBeanXXXXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXXXXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXXXXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXXXXX {
                    /**
                     * fa : 01
                     * fb : 01
                     */

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20190115Bean {
                /**
                 * temperature : 2℃~5℃
                 * weather : 小雨
                 * weather_id : {"fa":"07","fb":"07"}
                 * wind : 北风微风
                 * week : 星期一
                 * date : 20190114
                 */

                private String temperature;
                private String weather;
                private WeatherIdBeanXXXXXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXXXXXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXXXXXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXXXXXX {
                    /**
                     * fa : 07
                     * fb : 07
                     */

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20190116Bean {
                /**
                 * temperature : 2℃~5℃
                 * weather : 小雨
                 * weather_id : {"fa":"07","fb":"07"}
                 * wind : 北风微风
                 * week : 星期二
                 * date : 20190115
                 */

                private String temperature;
                private String weather;
                private WeatherIdBeanXXXXXXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXXXXXXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXXXXXXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXXXXXXX {
                    /**
                     * fa : 07
                     * fb : 07
                     */

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }
        }
    }
}
