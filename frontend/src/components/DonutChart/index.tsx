import axios from "axios"
import { useEffect, useState } from "react"
import ReactApexChart from "react-apexcharts"
import { SaleSum } from "types/sale"
import { BASE_URL } from "util/requests"

type ChartData = {
    labels: string[],
    series: number[]
}

const DonutChart = () => {

    const [chartData, setChartData] = useState<ChartData>({
        labels: [],
        series: []
    })

    useEffect(() => {
        axios.get(BASE_URL.concat("sales/amount-by-seller")).then(response => {
            const data = response.data as SaleSum[]
            const myLabels = data.map(x => x.sellerName)
            const mySeries = data.map(x => x.sumAmount)

            setChartData({
                labels: myLabels,
                series: mySeries
            })
        })
    }, [])

    // Forma errada
    // let chartData: ChartData = {
    //     labels: [],
    //     series: []
    // }

    // Forma errada
    // axios.get(BASE_URL.concat("sales/amount-by-seller")).then(response => {
    //     const data = response.data as SaleSum[]
    //     const myLabels = data.map(x => x.sellerName)
    //     const mySeries = data.map(x => x.sumAmount)

    //     setChartData({
    //         labels: myLabels, 
    //         series: mySeries
    //     })
    //     console.log(chartData)
    // })

    // const mockData = {
    //     series: [477138, 499928, 444867, 220426, 473088],
    //     labels: ['Anakin', 'Barry Allen', 'Kal-El', 'Logan', 'Padmé']
    // }

    const options = {
        legend: {
            show: true
        }
    }

    return (
        <ReactApexChart
            options={{ ...options, labels: chartData.labels }}
            series={chartData.series}
            type="donut"
            height="240"
        />
    )
}

export default DonutChart;
