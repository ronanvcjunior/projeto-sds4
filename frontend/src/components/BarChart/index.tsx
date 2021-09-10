import axios from "axios";
import { useEffect, useState } from "react";
import ReactApexChart from "react-apexcharts";
import { SaleSuccess } from "types/sale";
import { round } from "util/format";
import { BASE_URL } from "util/requests";

type SeriesData = {
    name: string,
    data: number[]
}

type ChartData = {
    labels: {
        categories: string[]
    },
    series: SeriesData[]
}

const BarChart = () => {
    const [chartData, setChartData] = useState<ChartData>({
        labels: { 
            categories: [] 
        },
        series: [
            {
                name: "",
                data: []
            }
        ]
    })

    useEffect(() => {
        axios.get(BASE_URL.concat("/sales/success-by-seller")).then(response => {
            const data = response.data as SaleSuccess[]
            const myLabels = data.map(x => x.sellerName)
            const mySeries = data.map(x => round(100.0 * x.sellerDeals / x.sellerVisited, 1))

            setChartData({
                labels: {
                    categories: myLabels
                },
                series: [
                    {
                        name: "% Sucesso",
                        data: mySeries
                    }
                ]
            })
        })
    }, [])

    const options = {
        plotOptions: {
            bar: {
                horizontal: true,
            },
        },
    };

    // const mockData = {
    //     labels: {
    //         categories: ["Anakin", "Barry Allen", "Kal-El", "Logan", "Padmé"],
    //     },
    //     series: [
    //         {
    //             name: "% Sucesso",
    //             data: [43.6, 67.1, 67.7, 45.6, 71.1],
    //         },
    //     ],
    // };

    return (
        <ReactApexChart
            options={{ ...options, xaxis: chartData.labels }}
            series={chartData.series}
            type="bar"
            height="240"
        />
    );
};

export default BarChart;
