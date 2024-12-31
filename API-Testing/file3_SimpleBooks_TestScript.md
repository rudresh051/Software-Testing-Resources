# Google Maps API

## Tests

```javascript
pm.test("Status code is 200", function () {
    pm.response.to.have.status(200);
});
```

## Simple Books API

* List of Books

```javascript
pm.test("Status code is 200", function () {
    pm.response.to.have.status(200);
});

const jsondata = pm.response.json();
// console.log("jsondata",jsondata)
const count = jsondata.length;
// console.log(count)
for(var i = 0;i<count;i++){
    var js1 = jsondata[i]
    if(js1.name=="The Vanishing Half")
    {
        var iid = js1.id;
        console.log(iid)
        pm.environment.set("id1", iid);
    }
}
```

* Get All orders

```javascript
pm.test("Status code is 200", function () {
    pm.response.to.have.status(200);
});

const jsondata = pm.response.json();
var count = jsondata.length;
console.log("count",count)
for(var i=0;i<count;i++){
    var biid = jsondata[i];
    if(biid = jsondata[i]);
    if(biid.timestamp == "1734545392370"){
        var bookid = biid.id;
        pm.environment.set("orders",bookid)
    }
}
```
