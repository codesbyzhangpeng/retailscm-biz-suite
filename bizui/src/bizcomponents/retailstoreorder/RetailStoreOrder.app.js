import React from 'react'
import PropTypes from 'prop-types'
import {
  Layout,
  Menu,
  Icon,
  Avatar,
  Dropdown,
  Tag,
  message,
  Spin,
  Breadcrumb,
  AutoComplete,
  Input,Button
} from 'antd'
import DocumentTitle from 'react-document-title'
import { connect } from 'dva'
import { Link, Route, Redirect, Switch } from 'dva/router'
import moment from 'moment'
import groupBy from 'lodash/groupBy'
import { ContainerQuery } from 'react-container-query'
import classNames from 'classnames'
import styles from './RetailStoreOrder.app.less'
import {sessionObject} from '../../utils/utils'

import HeaderSearch from '../../components/HeaderSearch';
import NoticeIcon from '../../components/NoticeIcon';
import GlobalFooter from '../../components/GlobalFooter';


import GlobalComponents from '../../custcomponents';

import PermissionSettingService from '../../permission/PermissionSetting.service'
import appLocaleName from '../../common/Locale.tool'
import BizAppTool from '../../common/BizApp.tool'

const { Header, Sider, Content } = Layout
const { SubMenu } = Menu
const {
  defaultFilteredNoGroupMenuItems,
  defaultFilteredMenuItemsGroup,
  defaultRenderMenuItem,

} = BizAppTool


const filteredNoGroupMenuItems = defaultFilteredNoGroupMenuItems
const filteredMenuItemsGroup = defaultFilteredMenuItemsGroup
const renderMenuItem=defaultRenderMenuItem



const query = {
  'screen-xs': {
    maxWidth: 575,
  },
  'screen-sm': {
    minWidth: 576,
    maxWidth: 767,
  },
  'screen-md': {
    minWidth: 768,
    maxWidth: 991,
  },
  'screen-lg': {
    minWidth: 992,
    maxWidth: 1199,
  },
  'screen-xl': {
    minWidth: 1200,
  },
}




class RetailStoreOrderBizApp extends React.PureComponent {
  constructor(props) {
    super(props)
     this.state = {
      openKeys: this.getDefaultCollapsedSubMenus(props),
    }
  }

  componentDidMount() {}
  componentWillUnmount() {
    clearTimeout(this.resizeTimeout)
  }
  onCollapse = (collapsed) => {
    this.props.dispatch({
      type: 'global/changeLayoutCollapsed',
      payload: collapsed,
    })
  }

  getDefaultCollapsedSubMenus = (props) => {
    const currentMenuSelectedKeys = [...this.getCurrentMenuSelectedKeys(props)]
    currentMenuSelectedKeys.splice(-1, 1)
    if (currentMenuSelectedKeys.length === 0) {
      return ['/retailStoreOrder/']
    }
    return currentMenuSelectedKeys
  }
  getCurrentMenuSelectedKeys = (props) => {
    const { location: { pathname } } = props || this.props
    const keys = pathname.split('/').slice(1)
    if (keys.length === 1 && keys[0] === '') {
      return [this.menus[0].key]
    }
    return keys
  }
  
  getNavMenuItems = (targetObject) => {
  

    const menuData = sessionObject('menuData')
    const targetApp = sessionObject('targetApp')
	const {objectId}=targetApp;
  	const userContext = null
    return (
      
		  <Menu
             theme="dark"
             mode="inline"
            
             
             onOpenChange={this.handleOpenChange}
            
             defaultOpenKeys={['firstOne']}
             style={{ margin: '16px 0', width: '100%' }}
           >
           

             <Menu.Item key="dashboard">
               <Link to={`/retailStoreOrder/${this.props.retailStoreOrder.id}/dashboard`}><Icon type="dashboard" /><span>{appLocaleName(userContext,"Dashboard")}</span></Link>
             </Menu.Item>
           
        {filteredNoGroupMenuItems(targetObject,this).map((item)=>(renderMenuItem(item)))}  
        {filteredMenuItemsGroup(targetObject,this).map((groupedMenuItem,index)=>{
          return(
    <SubMenu key={`vg${index}`} title={<span><Icon type="folder" /><span>{`${groupedMenuItem.viewGroup}`}</span></span>} >
      {groupedMenuItem.subItems.map((item)=>(renderMenuItem(item)))}  
    </SubMenu>

        )}
        )}

       		<SubMenu key="sub4" title={<span><Icon type="setting" /><span>{appLocaleName(userContext,"Setting")}</span></span>} >
       			<Menu.Item key="profile">
               		<Link to={`/retailStoreOrder/${this.props.retailStoreOrder.id}/permission`}><Icon type="safety-certificate" /><span>{appLocaleName(userContext,"Permission")}</span></Link>
             	</Menu.Item>
             	<Menu.Item key="permission">
               		<Link to={`/retailStoreOrder/${this.props.retailStoreOrder.id}/profile`}><Icon type="cluster" /><span>{appLocaleName(userContext,"Profile")}</span></Link>
             	</Menu.Item> 
      
        	</SubMenu>
        
           </Menu>
    )
  }
  



  getRetailStoreOrderLineItemSearch = () => {
    const {RetailStoreOrderLineItemSearch} = GlobalComponents;
    const userContext = null
    return connect(state => ({
      rule: state.rule,
      name: "Retail Store Order Line Item",
      role: "retailStoreOrderLineItem",
      data: state._retailStoreOrder.retailStoreOrderLineItemList,
      metaInfo: state._retailStoreOrder.retailStoreOrderLineItemListMetaInfo,
      count: state._retailStoreOrder.retailStoreOrderLineItemCount,
      currentPage: state._retailStoreOrder.retailStoreOrderLineItemCurrentPageNumber,
      searchFormParameters: state._retailStoreOrder.retailStoreOrderLineItemSearchFormParameters,
      searchParameters: {...state._retailStoreOrder.searchParameters},
      expandForm: state._retailStoreOrder.expandForm,
      loading: state._retailStoreOrder.loading,
      partialList: state._retailStoreOrder.partialList,
      owner: { type: '_retailStoreOrder', id: state._retailStoreOrder.id, 
      referenceName: 'bizOrder', 
      listName: 'retailStoreOrderLineItemList', ref:state._retailStoreOrder, 
      listDisplayName: appLocaleName(userContext,"List") }, // this is for model namespace and
    }))(RetailStoreOrderLineItemSearch)
  }
  getRetailStoreOrderLineItemCreateForm = () => {
   	const {RetailStoreOrderLineItemCreateForm} = GlobalComponents;
   	const userContext = null
    return connect(state => ({
      rule: state.rule,
      role: "retailStoreOrderLineItem",
      data: state._retailStoreOrder.retailStoreOrderLineItemList,
      metaInfo: state._retailStoreOrder.retailStoreOrderLineItemListMetaInfo,
      count: state._retailStoreOrder.retailStoreOrderLineItemCount,
      currentPage: state._retailStoreOrder.retailStoreOrderLineItemCurrentPageNumber,
      searchFormParameters: state._retailStoreOrder.retailStoreOrderLineItemSearchFormParameters,
      loading: state._retailStoreOrder.loading,
      owner: { type: '_retailStoreOrder', id: state._retailStoreOrder.id, referenceName: 'bizOrder', listName: 'retailStoreOrderLineItemList', ref:state._retailStoreOrder, listDisplayName: appLocaleName(userContext,"List")}, // this is for model namespace and
    }))(RetailStoreOrderLineItemCreateForm)
  }
  
  getRetailStoreOrderLineItemUpdateForm = () => {
    const userContext = null
  	const {RetailStoreOrderLineItemUpdateForm} = GlobalComponents;
    return connect(state => ({
      selectedRows: state._retailStoreOrder.selectedRows,
      role: "retailStoreOrderLineItem",
      currentUpdateIndex: state._retailStoreOrder.currentUpdateIndex,
      owner: { type: '_retailStoreOrder', id: state._retailStoreOrder.id, listName: 'retailStoreOrderLineItemList', ref:state._retailStoreOrder, listDisplayName: appLocaleName(userContext,"List") }, // this is for model namespace and
    }))(RetailStoreOrderLineItemUpdateForm)
  }

  getRetailStoreOrderShippingGroupSearch = () => {
    const {RetailStoreOrderShippingGroupSearch} = GlobalComponents;
    const userContext = null
    return connect(state => ({
      rule: state.rule,
      name: "Retail Store Order Shipping Group",
      role: "retailStoreOrderShippingGroup",
      data: state._retailStoreOrder.retailStoreOrderShippingGroupList,
      metaInfo: state._retailStoreOrder.retailStoreOrderShippingGroupListMetaInfo,
      count: state._retailStoreOrder.retailStoreOrderShippingGroupCount,
      currentPage: state._retailStoreOrder.retailStoreOrderShippingGroupCurrentPageNumber,
      searchFormParameters: state._retailStoreOrder.retailStoreOrderShippingGroupSearchFormParameters,
      searchParameters: {...state._retailStoreOrder.searchParameters},
      expandForm: state._retailStoreOrder.expandForm,
      loading: state._retailStoreOrder.loading,
      partialList: state._retailStoreOrder.partialList,
      owner: { type: '_retailStoreOrder', id: state._retailStoreOrder.id, 
      referenceName: 'bizOrder', 
      listName: 'retailStoreOrderShippingGroupList', ref:state._retailStoreOrder, 
      listDisplayName: appLocaleName(userContext,"List") }, // this is for model namespace and
    }))(RetailStoreOrderShippingGroupSearch)
  }
  getRetailStoreOrderShippingGroupCreateForm = () => {
   	const {RetailStoreOrderShippingGroupCreateForm} = GlobalComponents;
   	const userContext = null
    return connect(state => ({
      rule: state.rule,
      role: "retailStoreOrderShippingGroup",
      data: state._retailStoreOrder.retailStoreOrderShippingGroupList,
      metaInfo: state._retailStoreOrder.retailStoreOrderShippingGroupListMetaInfo,
      count: state._retailStoreOrder.retailStoreOrderShippingGroupCount,
      currentPage: state._retailStoreOrder.retailStoreOrderShippingGroupCurrentPageNumber,
      searchFormParameters: state._retailStoreOrder.retailStoreOrderShippingGroupSearchFormParameters,
      loading: state._retailStoreOrder.loading,
      owner: { type: '_retailStoreOrder', id: state._retailStoreOrder.id, referenceName: 'bizOrder', listName: 'retailStoreOrderShippingGroupList', ref:state._retailStoreOrder, listDisplayName: appLocaleName(userContext,"List")}, // this is for model namespace and
    }))(RetailStoreOrderShippingGroupCreateForm)
  }
  
  getRetailStoreOrderShippingGroupUpdateForm = () => {
    const userContext = null
  	const {RetailStoreOrderShippingGroupUpdateForm} = GlobalComponents;
    return connect(state => ({
      selectedRows: state._retailStoreOrder.selectedRows,
      role: "retailStoreOrderShippingGroup",
      currentUpdateIndex: state._retailStoreOrder.currentUpdateIndex,
      owner: { type: '_retailStoreOrder', id: state._retailStoreOrder.id, listName: 'retailStoreOrderShippingGroupList', ref:state._retailStoreOrder, listDisplayName: appLocaleName(userContext,"List") }, // this is for model namespace and
    }))(RetailStoreOrderShippingGroupUpdateForm)
  }

  getRetailStoreOrderPaymentGroupSearch = () => {
    const {RetailStoreOrderPaymentGroupSearch} = GlobalComponents;
    const userContext = null
    return connect(state => ({
      rule: state.rule,
      name: "Retail Store Order Payment Group",
      role: "retailStoreOrderPaymentGroup",
      data: state._retailStoreOrder.retailStoreOrderPaymentGroupList,
      metaInfo: state._retailStoreOrder.retailStoreOrderPaymentGroupListMetaInfo,
      count: state._retailStoreOrder.retailStoreOrderPaymentGroupCount,
      currentPage: state._retailStoreOrder.retailStoreOrderPaymentGroupCurrentPageNumber,
      searchFormParameters: state._retailStoreOrder.retailStoreOrderPaymentGroupSearchFormParameters,
      searchParameters: {...state._retailStoreOrder.searchParameters},
      expandForm: state._retailStoreOrder.expandForm,
      loading: state._retailStoreOrder.loading,
      partialList: state._retailStoreOrder.partialList,
      owner: { type: '_retailStoreOrder', id: state._retailStoreOrder.id, 
      referenceName: 'bizOrder', 
      listName: 'retailStoreOrderPaymentGroupList', ref:state._retailStoreOrder, 
      listDisplayName: appLocaleName(userContext,"List") }, // this is for model namespace and
    }))(RetailStoreOrderPaymentGroupSearch)
  }
  getRetailStoreOrderPaymentGroupCreateForm = () => {
   	const {RetailStoreOrderPaymentGroupCreateForm} = GlobalComponents;
   	const userContext = null
    return connect(state => ({
      rule: state.rule,
      role: "retailStoreOrderPaymentGroup",
      data: state._retailStoreOrder.retailStoreOrderPaymentGroupList,
      metaInfo: state._retailStoreOrder.retailStoreOrderPaymentGroupListMetaInfo,
      count: state._retailStoreOrder.retailStoreOrderPaymentGroupCount,
      currentPage: state._retailStoreOrder.retailStoreOrderPaymentGroupCurrentPageNumber,
      searchFormParameters: state._retailStoreOrder.retailStoreOrderPaymentGroupSearchFormParameters,
      loading: state._retailStoreOrder.loading,
      owner: { type: '_retailStoreOrder', id: state._retailStoreOrder.id, referenceName: 'bizOrder', listName: 'retailStoreOrderPaymentGroupList', ref:state._retailStoreOrder, listDisplayName: appLocaleName(userContext,"List")}, // this is for model namespace and
    }))(RetailStoreOrderPaymentGroupCreateForm)
  }
  
  getRetailStoreOrderPaymentGroupUpdateForm = () => {
    const userContext = null
  	const {RetailStoreOrderPaymentGroupUpdateForm} = GlobalComponents;
    return connect(state => ({
      selectedRows: state._retailStoreOrder.selectedRows,
      role: "retailStoreOrderPaymentGroup",
      currentUpdateIndex: state._retailStoreOrder.currentUpdateIndex,
      owner: { type: '_retailStoreOrder', id: state._retailStoreOrder.id, listName: 'retailStoreOrderPaymentGroupList', ref:state._retailStoreOrder, listDisplayName: appLocaleName(userContext,"List") }, // this is for model namespace and
    }))(RetailStoreOrderPaymentGroupUpdateForm)
  }

  getGoodsSearch = () => {
    const {GoodsSearch} = GlobalComponents;
    const userContext = null
    return connect(state => ({
      rule: state.rule,
      name: "Goods",
      role: "goods",
      data: state._retailStoreOrder.goodsList,
      metaInfo: state._retailStoreOrder.goodsListMetaInfo,
      count: state._retailStoreOrder.goodsCount,
      currentPage: state._retailStoreOrder.goodsCurrentPageNumber,
      searchFormParameters: state._retailStoreOrder.goodsSearchFormParameters,
      searchParameters: {...state._retailStoreOrder.searchParameters},
      expandForm: state._retailStoreOrder.expandForm,
      loading: state._retailStoreOrder.loading,
      partialList: state._retailStoreOrder.partialList,
      owner: { type: '_retailStoreOrder', id: state._retailStoreOrder.id, 
      referenceName: 'retailStoreOrder', 
      listName: 'goodsList', ref:state._retailStoreOrder, 
      listDisplayName: appLocaleName(userContext,"List") }, // this is for model namespace and
    }))(GoodsSearch)
  }
  getGoodsCreateForm = () => {
   	const {GoodsCreateForm} = GlobalComponents;
   	const userContext = null
    return connect(state => ({
      rule: state.rule,
      role: "goods",
      data: state._retailStoreOrder.goodsList,
      metaInfo: state._retailStoreOrder.goodsListMetaInfo,
      count: state._retailStoreOrder.goodsCount,
      currentPage: state._retailStoreOrder.goodsCurrentPageNumber,
      searchFormParameters: state._retailStoreOrder.goodsSearchFormParameters,
      loading: state._retailStoreOrder.loading,
      owner: { type: '_retailStoreOrder', id: state._retailStoreOrder.id, referenceName: 'retailStoreOrder', listName: 'goodsList', ref:state._retailStoreOrder, listDisplayName: appLocaleName(userContext,"List")}, // this is for model namespace and
    }))(GoodsCreateForm)
  }
  
  getGoodsUpdateForm = () => {
    const userContext = null
  	const {GoodsUpdateForm} = GlobalComponents;
    return connect(state => ({
      selectedRows: state._retailStoreOrder.selectedRows,
      role: "goods",
      currentUpdateIndex: state._retailStoreOrder.currentUpdateIndex,
      owner: { type: '_retailStoreOrder', id: state._retailStoreOrder.id, listName: 'goodsList', ref:state._retailStoreOrder, listDisplayName: appLocaleName(userContext,"List") }, // this is for model namespace and
    }))(GoodsUpdateForm)
  }


  
  buildRouters = () =>{
  	const {RetailStoreOrderDashboard} = GlobalComponents
  	const {RetailStoreOrderPermission} = GlobalComponents
  	const {RetailStoreOrderProfile} = GlobalComponents
  	
  	
  	const routers=[
  	{path:"/retailStoreOrder/:id/dashboard", component: RetailStoreOrderDashboard},
  	{path:"/retailStoreOrder/:id/profile", component: RetailStoreOrderProfile},
  	{path:"/retailStoreOrder/:id/permission", component: RetailStoreOrderPermission},
  	
  	
  	
  	{path:"/retailStoreOrder/:id/list/retailStoreOrderLineItemList", component: this.getRetailStoreOrderLineItemSearch()},
  	{path:"/retailStoreOrder/:id/list/retailStoreOrderLineItemCreateForm", component: this.getRetailStoreOrderLineItemCreateForm()},
  	{path:"/retailStoreOrder/:id/list/retailStoreOrderLineItemUpdateForm", component: this.getRetailStoreOrderLineItemUpdateForm()},
   	
  	{path:"/retailStoreOrder/:id/list/retailStoreOrderShippingGroupList", component: this.getRetailStoreOrderShippingGroupSearch()},
  	{path:"/retailStoreOrder/:id/list/retailStoreOrderShippingGroupCreateForm", component: this.getRetailStoreOrderShippingGroupCreateForm()},
  	{path:"/retailStoreOrder/:id/list/retailStoreOrderShippingGroupUpdateForm", component: this.getRetailStoreOrderShippingGroupUpdateForm()},
   	
  	{path:"/retailStoreOrder/:id/list/retailStoreOrderPaymentGroupList", component: this.getRetailStoreOrderPaymentGroupSearch()},
  	{path:"/retailStoreOrder/:id/list/retailStoreOrderPaymentGroupCreateForm", component: this.getRetailStoreOrderPaymentGroupCreateForm()},
  	{path:"/retailStoreOrder/:id/list/retailStoreOrderPaymentGroupUpdateForm", component: this.getRetailStoreOrderPaymentGroupUpdateForm()},
   	
  	{path:"/retailStoreOrder/:id/list/goodsList", component: this.getGoodsSearch()},
  	{path:"/retailStoreOrder/:id/list/goodsCreateForm", component: this.getGoodsCreateForm()},
  	{path:"/retailStoreOrder/:id/list/goodsUpdateForm", component: this.getGoodsUpdateForm()},
     	
  	
  	]
  	
  	const {extraRoutesFunc} = this.props;
	const extraRoutes = extraRoutesFunc?extraRoutesFunc():[]
    const finalRoutes = routers.concat(extraRoutes)
    
  	return (<Switch>
             {finalRoutes.map((item)=>(<Route key={item.path} path={item.path} component={item.component} />))}    
  	  	</Switch>)
  	
  
  }
 

  getPageTitle = () => {
    // const { location } = this.props
    // const { pathname } = location
    const title = '双链小超全流程供应链系统'
    return title
  }
 
  handleOpenChange = (openKeys) => {
    const latestOpenKey = openKeys.find(key => this.state.openKeys.indexOf(key) === -1)
    this.setState({
      openKeys: latestOpenKey ? [latestOpenKey] : [],
    })
  }
   toggle = () => {
     const { collapsed } = this.props
     this.props.dispatch({
       type: 'global/changeLayoutCollapsed',
       payload: !collapsed,
     })
   }
    logout = () => {
   
    console.log("log out called")
    this.props.dispatch({ type: 'launcher/signOut' })
  }
   render() {
     // const { collapsed, fetchingNotices,loading } = this.props
     const { collapsed } = this.props
     
  
     const targetApp = sessionObject('targetApp')
     const currentBreadcrumb =targetApp?sessionObject(targetApp.id):[];
     const userContext = null
     const renderBreadcrumbText=(value)=>{
     	if(value==null){
     		return "..."
     	}
     	if(value.length < 10){
     		return value
     	}
     
     	return value.substring(0,10)+"..."
     	
     	
     }
     const menuProps = collapsed ? {} : {
       openKeys: this.state.openKeys,
     }
     const layout = (
     <Layout>
        <Header>
          
          <div className={styles.left}>
          <img
            src="./favicon.png"
            alt="logo"
            onClick={this.toggle}
            className={styles.logo}
          /><Link key={"__home"} to={"/home"} className={styles.breadcrumbLink}><Icon type="home" />&nbsp;{appLocaleName(userContext,"Home")}</Link>
          {currentBreadcrumb.map((item)=>{
            return (<Link  key={item.link} to={`${item.link}`} className={styles.breadcrumbLink}><Icon type="caret-right" />{renderBreadcrumbText(item.name)}</Link>)

          })}
         </div>
          <div className={styles.right}  >
          <Button type="primary"  icon="logout" onClick={()=>this.logout()}>
          {appLocaleName(userContext,"Exit")}</Button>
          </div>
          
        </Header>
       <Layout>
         <Sider
           trigger={null}
           collapsible
           collapsed={collapsed}
           breakpoint="md"
           onCollapse={()=>this.onCollapse(collapsed)}
           collapsedWidth={56}
           className={styles.sider}
         >

		 {this.getNavMenuItems(this.props.retailStoreOrder)}
		 
         </Sider>
         <Layout>
           <Content style={{ margin: '24px 24px 0', height: '100%' }}>
           
           {this.buildRouters()}
 
             
             
           </Content>
          </Layout>
        </Layout>
      </Layout>
     )
     return (
       <DocumentTitle title={this.getPageTitle()}>
         <ContainerQuery query={query}>
           {params => <div className={classNames(params)}>{layout}</div>}
         </ContainerQuery>
       </DocumentTitle>
     )
   }
}

export default connect(state => ({
  collapsed: state.global.collapsed,
  fetchingNotices: state.global.fetchingNotices,
  notices: state.global.notices,
  retailStoreOrder: state._retailStoreOrder,
  ...state,
}))(RetailStoreOrderBizApp)



