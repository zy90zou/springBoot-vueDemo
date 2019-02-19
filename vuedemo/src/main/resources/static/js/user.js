var vue = new Vue({
    el:"#app",
    data:{
        userList:[],
        user:{}
    },
    methods:{
        // 查询所有
        findAll:function () {
            var _this = this;
            axios.get("./user/findAll").then(function(res){
                //alert(JSON.stringify(res.data));
                //this.alert("OK");
                /**
                 * 注意：this如果在axios插件之外使用：是vue对象
                 * this如果在axios插件之内使用：是window对象
                 */
                _this.userList = res.data;
            }).catch(function (error) {

            })

        },
        // // 主键查询（传统方式）
        // findOne:function (id) {
        //     var _this = this;
        //     axios.get("./user/findOne",{params:{id:id}}).then(function(res){
        //         _this.user = res.data;
        //     }).catch(function (error) {
        //
        //     })
        // }
        // 主键查询（restful方式）
        findOne:function (id) {
            var _this = this;
            axios.get("./user/findOne/"+id).then(function(res){
                _this.user = res.data;
            }).catch(function (error) {

            })
        },
        // 更新
        update:function () {
            var _this = this;
            axios.post("./user/update",this.user).then(function(res){
                // 刷新页面
                _this.findAll();
            }).catch(function (error) {
                alert(""+error+"保存有误，请联系管理员！")
            })
        }
    },
    created:function () {
        this.findAll();
    }
	
})