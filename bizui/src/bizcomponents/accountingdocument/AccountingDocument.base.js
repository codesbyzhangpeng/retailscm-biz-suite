import React from 'react'
import { Icon,Divider } from 'antd'

import { Link } from 'dva/router'
import moment from 'moment'
import ImagePreview from '../../components/ImagePreview'
import appLocaleName from '../../common/Locale.tool'
import BaseTool from '../../common/Base.tool'
import GlobalComponents from '../../custcomponents'
import DescriptionList from '../../components/DescriptionList'
const { Description } = DescriptionList
const {
	defaultRenderReferenceCell,
	defaultRenderBooleanCell,
	defaultRenderMoneyCell,
	defaultRenderDateTimeCell,
	defaultRenderImageCell,
	defaultRenderDateCell,
	defaultRenderIdentifier,
	defaultRenderTextCell,
} = BaseTool

const renderTextCell=defaultRenderTextCell
const renderIdentifier=defaultRenderIdentifier
const renderDateCell=defaultRenderDateCell
const renderDateTimeCell=defaultRenderDateTimeCell
const renderImageCell=defaultRenderImageCell
const renderMoneyCell=defaultRenderMoneyCell
const renderBooleanCell=defaultRenderBooleanCell
const renderReferenceCell=defaultRenderReferenceCell


const menuData = {menuName:"Accounting Document", menuFor: "accountingDocument",
  		subItems: [
  {name: 'originalVoucherList', displayName:'Original Voucher', icon:'500px',readPermission: false,createPermission: false,deletePermission: false,updatePermission: false,executionPermission: false, viewGroup: '__no_group'},
  {name: 'accountingDocumentLineList', displayName:'Accounting Document Line', icon:'line',readPermission: false,createPermission: false,deletePermission: false,updatePermission: false,executionPermission: false, viewGroup: '__no_group'},
  
  		],
}

const fieldLabels = {
  id: 'Id',
  name: 'Name',
  accountingDocumentDate: 'Accounting Document Date',
  accountingPeriod: 'Accounting Period',
  documentType: 'Document Type',
  creation: 'Creation',
  confirmation: 'Confirmation',
  auditing: 'Auditing',
  posting: 'Posting',
  currentStatus: 'Current Status',

}

const displayColumns = [
  { title: fieldLabels.id, debugtype: 'string', dataIndex: 'id', width: '20', render: (text, record)=>renderTextCell(text,record,'accountingDocument') , sorter: true },
  { title: fieldLabels.name, debugtype: 'string', dataIndex: 'name', width: '8',render: (text, record)=>renderTextCell(text,record)},
  { title: fieldLabels.accountingDocumentDate, dataIndex: 'accountingDocumentDate', render: (text, record) =>renderDateCell(text,record), sorter: true },
  { title: fieldLabels.accountingPeriod, dataIndex: 'accountingPeriod', render: (text, record) => renderReferenceCell(text, record), sorter:true},
  { title: fieldLabels.documentType, dataIndex: 'documentType', render: (text, record) => renderReferenceCell(text, record), sorter:true},
  { title: fieldLabels.creation, dataIndex: 'creation', render: (text, record) => renderReferenceCell(text, record), sorter:true},
  { title: fieldLabels.confirmation, dataIndex: 'confirmation', render: (text, record) => renderReferenceCell(text, record), sorter:true},
  { title: fieldLabels.auditing, dataIndex: 'auditing', render: (text, record) => renderReferenceCell(text, record), sorter:true},
  { title: fieldLabels.posting, dataIndex: 'posting', render: (text, record) => renderReferenceCell(text, record), sorter:true},
  { title: fieldLabels.currentStatus, debugtype: 'string', dataIndex: 'currentStatus', width: '13',render: (text, record)=>renderTextCell(text,record)},

]
// refernce to https://ant.design/components/list-cn/
const renderItemOfList=(accountingDocument,targetComponent)=>{

	
	
	
	const userContext = null
	return (
	<div key={accountingDocument.id}>
	
	<DescriptionList  key={accountingDocument.id} size="small" col="4">
<Description term="Id">{accountingDocument.id}</Description> 
<Description term="Name">{accountingDocument.name}</Description> 
<Description term="Accounting Document Date">{ moment(accountingDocument.accountingDocumentDate).format('YYYY-MM-DD')}</Description> 
<Description term="Accounting Period">{accountingDocument.accountingPeriod==null?appLocaleName(userContext,"NotAssigned"):`${accountingDocument.accountingPeriod.displayName}(${accountingDocument.accountingPeriod.id})`}
</Description>
<Description term="Document Type">{accountingDocument.documentType==null?appLocaleName(userContext,"NotAssigned"):`${accountingDocument.documentType.displayName}(${accountingDocument.documentType.id})`}
</Description>
<Description term="Current Status">{accountingDocument.currentStatus}</Description> 
	
        
      </DescriptionList>
       <Divider style={{ height: '2px' }} />
      </div>
	)

}
	



const AccountingDocumentBase={menuData,displayColumns,fieldLabels,renderItemOfList}
export default AccountingDocumentBase



