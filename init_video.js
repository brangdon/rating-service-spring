
conn = new Mongo();
db = conn.getDB("video_database");
db.video.insertMany([
   {
    "ratings": [
 
        {
            "value": 6
        },
        {
            "value": 10
        },
        
    ],
    "title": "sample drama",
    "type": "drama",
    "production_date": new Date("2016-05-18T16:00:00Z")
},
   {
    "ratings": [
 
        {
            "value": 4
        },
        {
            "value": 5
        },
		        {
            "value": 7
        },
		        {
            "value": 1
        }
        
    ],
    "title": "sample romantic",
    "type": "romantic",
    "production_date": new Date("2010-04-17T16:00:00Z")
},   {
    "ratings": [
 
        {
            "value": 6
        },
        {
            "value": 9
        },
        
    ],
    "title": "sample sensation",
    "type": "sensation",
    "production_date": new Date("2011-02-28T16:00:00Z")
},   {
    "ratings": [
 
        {
            "value": 6
        },
        {
            "value": 10
        },
		        {
            "value": 8
        }
        
    ],
    "title": "sample drama2",
    "type": "drama",
    "production_date": new Date("2008-03-10T16:00:00Z")
},
   {
    "ratings": [
 
        {
            "value": 4
        },
        {
            "value": 5
        },
		        {
            "value": 10
        }
        
    ],
    "title": "sample romantic2",
    "type": "romantic",
    "production_date": new Date("2000-02-17T16:00:00Z")
},   {
    "ratings": [
 
        {
            "value": 10
        },
        {
            "value": 10
        },
        
    ],
    "title": "sample sensation2",
    "type": "sensation",
    "production_date": new Date("1991-06-18T16:00:00Z")
}
])

